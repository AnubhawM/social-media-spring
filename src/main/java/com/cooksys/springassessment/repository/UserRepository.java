package com.cooksys.springassessment.repository;

import com.cooksys.springassessment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	User getByUsername(String username);

}
