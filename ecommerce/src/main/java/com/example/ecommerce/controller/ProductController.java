package com.example.ecommerce.controller;

import com.example.ecommerce.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ecommerce.entity.*;

@Controller

public class ProductController {
	@Autowired
	ProductService s;
	
	@GetMapping("/home")
	public String get1() {
		return "index";
	}
	
	@PostMapping("abc")
	public String get2(Product p) {
		s.set1(p);
		return "sucess";
	}
}
