package com.cooksys.springassessment.dto;

import org.springframework.stereotype.Component;

import com.cooksys.springassessment.entity.Credentials;

@Component
public class CreateTweetDto {
	
	private Integer id;
	private String content;
	private Credentials credentials;
	
	public CreateTweetDto(String content, Credentials credentials ) {
		this.content = content;
		this.credentials = credentials;
	}
	
	public CreateTweetDto() {

	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	
	
	
	
}
