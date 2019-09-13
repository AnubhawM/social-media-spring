package com.cooksys.springassessment.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.springassessment.dto.CreateTweetDto;
import com.cooksys.springassessment.dto.TweetDto;
import com.cooksys.springassessment.dto.UserDto;
import com.cooksys.springassessment.service.TweetService;


@RestController
@RequestMapping("/tweets")
public class TweetController {
	
	private TweetService tweetService;
	
	public TweetController(TweetService tweetService) {
		this.tweetService = tweetService;
	}
	
	
	@PostMapping
	public ResponseEntity<TweetDto> createDto(@RequestBody CreateTweetDto createTweetDto) {
		return tweetService.createDto(createTweetDto);
	}
	
	@GetMapping
	public ResponseEntity<List<TweetDto>> getTweets() {
		return tweetService.getAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TweetDto> getTweetById(@PathVariable(name = "id") Integer id) {
		return tweetService.getTweetById(id);
	}
	
}
