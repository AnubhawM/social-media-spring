package com.cooksys.springassessment.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cooksys.springassessment.dto.CreateTweetDto;
import com.cooksys.springassessment.dto.TweetDto;
import com.cooksys.springassessment.dto.UserDto;
import com.cooksys.springassessment.entity.Tweet;
import com.cooksys.springassessment.entity.User;
import com.cooksys.springassessment.mapper.TweetMapper;
import com.cooksys.springassessment.repository.TweetRepository;


@Service
public class TweetService {
	
	private TweetRepository tweetRepository;
	private TweetMapper tweetMapper;

	public TweetService(TweetRepository tweetRepository, TweetMapper tweetMapper) {
		this.tweetRepository = tweetRepository;
		this.tweetMapper = tweetMapper;
	}
	
	List<TweetDto> tweetList;
	
	public ResponseEntity<TweetDto> createDto(CreateTweetDto createTweetDto) {
		Tweet tweetToCreate = tweetMapper.createTweetDtoToEntity(createTweetDto);
		Tweet tweetCreated = tweetRepository.saveAndFlush(tweetToCreate);
		tweetList.add(tweetMapper.entityToDto(tweetCreated));
		return new ResponseEntity<>(tweetMapper.entityToDto(tweetCreated), HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<TweetDto>> getAll() {
		return new ResponseEntity<>(tweetMapper.entitiesToDtos(tweetRepository.findAll()), HttpStatus.OK);
	}

	public ResponseEntity<TweetDto> getTweetById(Integer id) {
		Tweet tweet = tweetRepository.getById(id);
		return new ResponseEntity<>(tweetMapper.entityToDto(tweet), HttpStatus.OK);
		}

}
