package com.cooksys.springassessment.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cooksys.springassessment.dto.CreateUserDto;
import com.cooksys.springassessment.dto.UserDto;
import com.cooksys.springassessment.entity.User;
import com.cooksys.springassessment.mapper.UserMapper;
import com.cooksys.springassessment.repository.UserRepository;


@Service
public class UserService {
	
	private UserRepository userRepository;
	private UserMapper userMapper;
	
	
	public UserService(UserRepository userRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}
	
	public ResponseEntity<UserDto> createDto(CreateUserDto createUserDto) {
		User user = userRepository.getByUsername(createUserDto.getUsername());
		User userToCreate = userMapper.createUserDtoToEntity(createUserDto);
		User userCreated = userRepository.saveAndFlush(userToCreate);
		return new ResponseEntity<>(userMapper.entityToDto(userCreated), HttpStatus.CREATED);
		}
	
	
	public ResponseEntity<List<UserDto>> getAll() {
		return new ResponseEntity<>(userMapper.entitiesToDtos(userRepository.findAll()), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> getByUsername(String username) {
		User user = userRepository.getByUsername(username);
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> updateUsername(String username) {
		User user = userRepository.getByUsername(username);
		user.setUsername(username);
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> followUser(CreateUserDto createUserDto) {
		User user = userRepository.getByUsername(createUserDto.getUsername());
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> deleteUser(String username) {
		User user = userRepository.getByUsername(username);
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> unfollowUser(CreateUserDto createUserDto) {
		User user = userRepository.getByUsername(createUserDto.getUsername());
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> getFeed(String username) {
		User user = userRepository.getByUsername(username);
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> getTweets(String username) {
		User user = userRepository.getByUsername(username);
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> getMentions(String username) {
		User user = userRepository.getByUsername(username);
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> getFollowers(String username) {
		User user = userRepository.getByUsername(username);
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}

	public ResponseEntity<UserDto> getFollowing(String username) {
		User user = userRepository.getByUsername(username);
		return new ResponseEntity<>(userMapper.entityToDto(user), HttpStatus.OK);
	}
	
	
	
	
	
	
	

}
