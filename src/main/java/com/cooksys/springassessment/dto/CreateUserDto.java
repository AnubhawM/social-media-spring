package com.cooksys.springassessment.dto;

import com.cooksys.springassessment.entity.Profile;

import org.springframework.stereotype.Component;

import com.cooksys.springassessment.entity.Credentials;

@Component
public class CreateUserDto {
	
	private Profile profile;
	private Credentials credentials;
	private java.sql.Timestamp joined;
	
	
	public CreateUserDto(Credentials credentials, Profile profile) {
		this.credentials = credentials;
		this.profile = profile;
	}
	
	public CreateUserDto() {
		
	}

	public String getUsername() {
		return this.credentials.getUsername();
	}


	public Credentials getCredentials() {
		return credentials;
	}


	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
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
