package com.cooksys.springassessment.entity;


import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

//import com.cooksys.springassessment.dto.CredentialsDto;
import com.cooksys.springassessment.entity.Credentials;;



@Entity
@Table(name = "Users")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String username;
    

    @ElementCollection
    private List<User> users;
    

    @CreationTimestamp
    private java.sql.Timestamp joined;
    
    
    @Embedded
    @AttributeOverride(name="username", column=@Column(name="username_DB"))
    private Credentials credentials;
    
    @Embedded
    private Profile profile;
    
    
    public User() {
    	
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public java.sql.Timestamp getJoined() {
		return joined;
	}

	public void setJoined(java.sql.Timestamp joined) {
		this.joined = joined;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
    
    
}
