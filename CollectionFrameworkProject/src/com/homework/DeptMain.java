package com.homework;

import java.util.HashMap;
import java.util.Map;

public class DeptMain {

	public static void main(String[] args) {
		Map <Integer,Department> map = new HashMap<>();
		
		Department dept1 = new Department(1, "IT", "Desc1", "V.N.Kore");
		Department dept2 = new Department(2, "IT", "Desc1", "V.N.Kore");
		
		map.put(dept1.getId(), dept2);
		map.put(dept2.getId(), dept2);
		
	    System.out.println(map);
	}
}
