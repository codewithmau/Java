package com.comparable.project;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String city;
	private  double salary;
	
	
	public Employee(int id, String name, String city, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	

  public int compareTo (Employee emp){
      
	  return this.id - emp.id;
   }


//	public int compareTo(Employee emp) {
//
//		return this.id - emp.id;
//		//return city.compareTo(emp.city);
//		
////		 if(id == emp.id)
////			 return 0;
////		 else if(id > emp.id)
////			 return 1;
////		 else
////			 return -1;
//		
//		
//		
//		
//	}
	
	
}
