package com.cooksys.springassessment.dto;

import com.cooksys.springassessment.entity.Profile;

import org.springframework.stereotype.Component;


@Component
public class UserDto {
	
	private String username;
	private Profile profile;
	private java.sql.Timestamp joined;
	
	
	public UserDto() {
		
	}

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Profile getProfile() {
		return profile;
	}


	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	

	public java.sql.Timestamp getJoined() {
		return joined;
	}


	public void setJoined(java.sql.Timestamp joined) {
		this.joined = joined;
	}
	
	

}
