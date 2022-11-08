package com.map.problems;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap map = new HashMap<>();
		
		Map map = new HashMap<>();//always use this -better
		map.put("101", "Ram");
		map.put("102", "Shyam");
		map.put("102", "meet");
		map.put("104", "Ram");
		map.put(10, 11);
		map.put(null,null);
		map.put(10, null);
		map.put(null, 11);
		
		System.out.println(map);
		
	}
}
