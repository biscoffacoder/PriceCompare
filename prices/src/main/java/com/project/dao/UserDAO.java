package com.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.UserAccessEntity;
import com.project.repository.UserAccessRepo;

@Component
public class UserDAO {
	
	@Autowired
	UserAccessRepo userRepo;
	
	public void userRegister(UserAccessEntity userEntity) 
	{
		userRepo.save(userEntity);
	}
	
	public UserAccessEntity userLogin(UserAccessEntity user) 
	{
		return userRepo.findByEmailId(user.getEmailId());
	}

	

}
