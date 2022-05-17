package com.jobiak.empapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	@GeneratedValue
	private Long mid;
	private String brand;
	private String model;
	private double price;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public Mobile(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
}
