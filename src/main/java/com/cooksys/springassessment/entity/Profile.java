package com.cooksys.springassessment.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Profile {
	private String firstname;
	private String lastname;
	private String email;
	private String phone;


	public Profile() {
		
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	
}


