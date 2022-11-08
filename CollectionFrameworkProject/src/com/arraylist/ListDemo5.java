package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo5 {
    //Design the method to return list of employee
	
//	public static void main(String[] args) {
//		
//		List<Employee> list = new ArrayList();
//		list.add(new Employee(101,"Uma","Pune"));
//		list.add(new Employee(102,"Geet","Sangli"));
//		list.add(new Employee(103,"Priya","Palus"));
//		
//		System.out.println(list);
//		
//		for(Employee e : list) {
//			System.out.println(e.id);
//			
//		}
//	}
	
	public static void main(String[] args) {
		ListDemo5 obj = new ListDemo5();
		List<Employee> list = obj.getEmployeeList();
		System.out.println(list);
		
	}
	
	public List<Employee> getEmployeeList(){
		 
		 List<Employee> list = new ArrayList();
		 list.add(new Employee(101,"Uma","Pune"));
		 list.add(new Employee(102,"Geet","Sangli"));
		 
		 return list;
	}
}
