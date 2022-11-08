package com.practice;

public class Address implements Comparable<Address>{
	
	private String city;
	private String street_name;
	private int pincode;
	
	public Address(String city, String street_name, int pincode) {
		super();
		this.city = city;
		this.street_name = street_name;
		this.pincode = pincode;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", street_name=" + street_name + ", pincode=" + pincode + "]";
	}


	@Override
	public int compareTo(Address add) {
		
		//return this.pincode - (add.pincode); 
		
		//return city.compareTo(add.city);
		
		//return street_name.compareTo(add.street_name);
		
		if(getPincode() > add.getPincode())
			return 1;
		else if(getPincode() < add.getPincode())
			return -1;
		else 
			return 0;
			
		
		
	}
	
	

}
