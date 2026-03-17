package com.example.ecommerce.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String pname;
	int quantity;
	int price;
	String image;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pname, int quantity, int price,String image) {
		super();
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.image = image;	
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
