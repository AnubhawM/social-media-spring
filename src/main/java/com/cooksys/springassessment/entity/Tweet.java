package com.cooksys.springassessment.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cooksys.springassessment.entity.User;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Embedded   
    @AttributeOverride(name="id", column=@Column(name="tweet_id"))
    private User author;
    
    
    
    @CreationTimestamp
    private java.sql.Timestamp joined;
    
    private String content;
  
    private Tweet inReplyTo;
    
    private Tweet repostOf;
    
    @Embedded
    private Credentials credentials;
    @ManyToOne
    private User user;
    
    public Tweet() {
    	
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public java.sql.Timestamp getJoined() {
		return joined;
	}

	public void setJoined(java.sql.Timestamp joined) {
		this.joined = joined;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Tweet getInReplyTo() {
		return inReplyTo;
	}

	public void setInReplyTo(Tweet inReplyTo) {
		this.inReplyTo = inReplyTo;
	}

	public Tweet getRepostOf() {
		return repostOf;
	}

	public void setRepostOf(Tweet repostOf) {
		this.repostOf = repostOf;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
    	
}
