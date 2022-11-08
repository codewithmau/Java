package com.arraylist;

public class Employee {
	//Design the method to return list of employee

	int id=101;
	String name="Uma";
	String city="Pune";
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
		@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
