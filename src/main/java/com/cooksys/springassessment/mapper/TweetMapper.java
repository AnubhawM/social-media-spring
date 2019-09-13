package com.cooksys.springassessment.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cooksys.springassessment.dto.CreateTweetDto;
import com.cooksys.springassessment.dto.TweetDto;
import com.cooksys.springassessment.dto.UserDto;
import com.cooksys.springassessment.entity.Tweet;
import com.cooksys.springassessment.entity.User;

@Mapper(componentModel = "spring")
public interface TweetMapper {
	Tweet createTweetDtoToEntity(CreateTweetDto createTweetDto);
	TweetDto entityToDto(Tweet tweet);
	List<TweetDto> entitiesToDtos(List<Tweet> tweetList);
	
}
