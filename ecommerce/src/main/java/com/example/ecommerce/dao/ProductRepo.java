package com.example.ecommerce.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.entity.*;


public interface ProductRepo extends JpaRepository<Product, Integer>{
	
}
