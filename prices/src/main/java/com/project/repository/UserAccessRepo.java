package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.UserAccessEntity;

public interface UserAccessRepo extends JpaRepository<UserAccessEntity, Integer>{
	
	UserAccessEntity findByEmailId(String emailId);
}
