package com.paremal.firstSpringBoot;

public class Customer {
	String name;
	String address;
	
	
	public Customer() {
		super();
		this.name = "Merin";
		this.address = "meenangadi";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
