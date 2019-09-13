package com.cooksys.springassessment.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.springassessment.dto.CreateUserDto;
import com.cooksys.springassessment.dto.UserDto;
import com.cooksys.springassessment.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public ResponseEntity<UserDto> createDto(@RequestBody CreateUserDto createUserDto) {
		return userService.createDto(createUserDto);
	}
	
	@PostMapping("/@{username}/follow")
	public ResponseEntity<UserDto> followUser(@RequestBody CreateUserDto createUserDto, @PathVariable(name = "username") String username) {
		return userService.followUser(createUserDto);
	}
	
	@PostMapping("/@{username}/unfollow")
	public ResponseEntity<UserDto> unfollowUser(@RequestBody CreateUserDto createUserDto, @PathVariable(name = "username") String username) {
		return userService.unfollowUser(createUserDto);
	}
	
	@GetMapping
	public ResponseEntity<List<UserDto>> getUsers() {
		return userService.getAll();
	}
	
	@GetMapping("/@{username}")
	public ResponseEntity<UserDto> getByUsername(@PathVariable(name = "username") String username){
		return userService.getByUsername(username);
	}
	
	@GetMapping("/@{username}/feed")
	public ResponseEntity<UserDto> userFeed(@PathVariable(name = "username") String username) {
		return userService.getFeed(username);
	}
	
	@GetMapping("/@{username}/tweets")
	public ResponseEntity<UserDto> userTweets(@PathVariable(name = "username") String username) {
		return userService.getTweets(username);
	}
	
	@GetMapping("/@{username}/mentions")
	public ResponseEntity<UserDto> userMentions(@PathVariable(name = "username") String username) {
		return userService.getMentions(username);
	}
	
	@GetMapping("/@{username}/followers")
	public ResponseEntity<UserDto> userFollowers(@PathVariable(name = "username") String username) {
		return userService.getFollowers(username);
	}
	
	@GetMapping("/@{username}/following")
	public ResponseEntity<UserDto> userFollowing(@PathVariable(name = "username") String username) {
		return userService.getFollowing(username);
	}
	
	
	@PatchMapping("/@{username}")
	public ResponseEntity<UserDto> updateUsername(@PathVariable(name = "username") String username) {
		return userService.updateUsername(username);
	}
	
	
	@DeleteMapping("/@{username}")
	public ResponseEntity<UserDto> deleteUser(@PathVariable(name = "username") String username) {
		return userService.deleteUser(username);
	}
	
	
	
	

}
