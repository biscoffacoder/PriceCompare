package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.constants.ProjectConstants;
import com.project.delegate.UserDelegate;
import com.project.entity.UserAccessEntity;


@Controller
public class UserAccessController {
	
	@Autowired
	UserDelegate userDelegate;
	
	
	@GetMapping("/register.html")
	public String getRegister(Model model) 
	{
		model.addAttribute("user",new UserAccessEntity());
		
		return ProjectConstants.registerHtml;
	}

	@PostMapping("/registration")
	public String register(@ModelAttribute UserAccessEntity userAccess) 
	{
		userDelegate.registerUser(userAccess);
		
		return ProjectConstants.registerSucHtml;
		
	}
	
	@GetMapping("/login.html")
	public String loginUser(Model model) 
	{
		model.addAttribute("user",new UserAccessEntity());
		
		return ProjectConstants.loginUser;
	}
	
	@PostMapping("login")
	public String loggedUser(@ModelAttribute UserAccessEntity userEntity) 
	{
		System.out.println(userEntity.getEmailId());
		System.out.println(userEntity.getPassword());
		
		if(userEntity !=null) 
		{
			//forward
			 boolean flag=userDelegate.getUser(userEntity);
			//check return flag
			 System.out.println(flag+"Controller");
			if(flag) 
			{
				return ProjectConstants.loggedIn;
			}else 
			{
				return ProjectConstants.LoginError;
			}
			//send to logged in page
		}else 
		{
			return ProjectConstants.LoginFailed;
			//error
		}
		
		
	}
	
}
