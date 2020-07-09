package com.project.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.UserAccessEntity;
import com.project.service.UserService;

@Component
public class UserDelegate {

	@Autowired
	UserService userService;

	public void registerUser(UserAccessEntity userEntity) 
	{
		userService.registerUser(userEntity);
	}

	public boolean getUser(UserAccessEntity userEntity) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		flag= userService.getUser(userEntity);
		System.out.println(flag +"Delegate");
		return flag;
	}
}
