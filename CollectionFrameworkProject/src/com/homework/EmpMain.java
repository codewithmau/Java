package com.homework;

import java.util.HashMap;
import java.util.Map;

public class EmpMain {

	//Employee class object return
	
	public static void main(String[] args) {
		
		Map<Integer,Employee> map = new HashMap<>();
		
		Employee emp1 = new Employee(101,"Uma","Pune");
		Employee emp2 = new Employee(101,"Uma","Pune");
		
		map.put(emp1.getId(), emp1);
		map.put(emp2.getId(), emp2);
		
		System.out.println(map);
		
		
	}
}
