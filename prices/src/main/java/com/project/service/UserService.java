package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDAO;
import com.project.entity.UserAccessEntity;

@Service
public class UserService {

	@Autowired
	UserDAO userDao;

	public void registerUser(UserAccessEntity userEntity) 
	{

		userDao.userRegister(userEntity);

	}

	public boolean getUser(UserAccessEntity userEntity) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName());
		System.out.println(userEntity.getEmailId());
		System.out.println(userEntity.getPassword());
		boolean flag=false;
		UserAccessEntity user =userDao.userLogin(userEntity);
		
		System.out.println(user.getEmailId());
		System.out.println(user.getPassword());
		if(user!=null)
		{
			if(((userEntity.getEmailId().equalsIgnoreCase(user.getEmailId()))&&(userEntity.getPassword().equals(user.getPassword())))) 
			{
				System.out.println("login match");

				flag=true;
				
			}
		}

		System.out.println(flag +" Serivce");
		return flag;
	}
}
