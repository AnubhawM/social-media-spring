package com.cooksys.springassessment.dto;

import org.springframework.stereotype.Component;

import com.cooksys.springassessment.entity.Tweet;
import com.cooksys.springassessment.entity.User;


@Component
public class TweetDto {

	private java.sql.Timestamp posted;
	private String content;

	
	public TweetDto() {
		
	}


	public java.sql.Timestamp getPosted() {
		return posted;
	}


	public void setPosted(java.sql.Timestamp posted) {
		this.posted = posted;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	
	
	
}
