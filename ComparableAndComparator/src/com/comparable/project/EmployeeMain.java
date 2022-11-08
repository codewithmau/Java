package com.comparable.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List <Employee> list = new ArrayList<Employee>();
		list.add(new Employee(106,"Jeevan","Goa",96000));
		list.add(new Employee(103,"Ganesh","Pune",86000));
		list.add(new Employee(108,"Sarvesh","Benglore",50000));
		list.add(new Employee(105,"Priti","Mumbai",56000));
		list.add(new Employee(102,"Uma","Belgum",65000));
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
