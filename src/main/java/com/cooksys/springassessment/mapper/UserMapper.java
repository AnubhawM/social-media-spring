package com.cooksys.springassessment.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cooksys.springassessment.dto.CreateUserDto;
import com.cooksys.springassessment.dto.UserDto;
import com.cooksys.springassessment.entity.User;


@Mapper(componentModel = "spring")
public interface UserMapper {

	@Mapping(target = "credentials", source = "createUserDto.credentials")
	User createUserDtoToEntity(CreateUserDto createUserDto);
	
	
	@Mapping(target = "username", source = "credentials.username")
	UserDto entityToDto(User user);
	
	
	List<UserDto> entitiesToDtos(List<User> users);
}
