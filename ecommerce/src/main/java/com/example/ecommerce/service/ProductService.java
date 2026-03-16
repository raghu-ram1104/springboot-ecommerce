package com.example.ecommerce.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ecommerce.entity.*;
import com.example.ecommerce.dao.*;
;
@Service
public class ProductService {
	@Autowired
	ProductRepo r;
	
	public void set1(Product p)
	{
		r.save(p);
	}
	
	public List<Product> set2()
	{
		return r.findAll();
	}
}