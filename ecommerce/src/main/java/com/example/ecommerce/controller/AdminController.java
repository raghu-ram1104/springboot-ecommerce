package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

	@GetMapping("/adminlog")
	public String get1()
	{
		return "login";
	}
	@PostMapping("hello")
	public String get2(@RequestParam String username,@RequestParam String password,HttpSession session)
	{
		if(username.equals("admin") && password.equals("admin"))
		{
			session.setAttribute("admin", username);
			return "index";
		}
		return "login";
	}
}