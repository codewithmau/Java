package com.map.problems;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
     //Duplicate keys are not allow values is allowed
		
		Map<Integer,String> map = new HashMap<>();//always use this -better
		map.put(101, "Ram");
		map.put(102, "Shyam");
		map.put(103, "Shyam");
//		map.put(104, "Ram");
//		map.put(null,null);
//		map.put(10, null);
//		map.put(10, "geet");
		
		System.out.println(map);
	}
}
