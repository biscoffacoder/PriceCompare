package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.constants.ProjectConstants;
import com.project.entity.UserAccessEntity;

@Controller
public class StaticForwardController {

	@GetMapping("/home")
	public String getHomepage( ) 
	{
		return ProjectConstants.home;
	}
}
