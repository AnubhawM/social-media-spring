package com.cooksys.springassessment.repository;

import com.cooksys.springassessment.entity.Tweet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Integer>{

	Tweet getById(Integer id);
	
}
