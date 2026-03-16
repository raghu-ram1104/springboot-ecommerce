package com.example.ecommerce.controller;

import com.example.ecommerce.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ecommerce.entity.*;
import java.util.*;

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
	
	@GetMapping("/products")
	public String get3(Model m) {
		List<Product> l=s.set2();
		m.addAttribute("products", l);
		return "productlist";
	}
	
	@GetMapping("/product/{id}")
	public String get4(@PathVariable int id,Model m)
	{
		Optional<Product> p=s.set4(id);
		if(p.isPresent())
		{
			m.addAttribute("products",p.get());
			return "pathproduct";
		}
		else
		{
			return "error";
		}
	}
	
	@GetMapping("/del/{id}")
	public String get5(@PathVariable int id)
	{
		s.set3(id);
		return "delete";
	}
}
