package com.gymmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/login")
	public String login()
	{
		
		return "Admin-Login";
	}
	
	@GetMapping("/register")
	public String register()
	{
		
		return "Admin-Registration";
	}

}
