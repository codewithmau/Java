package com.map.problems;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo3 {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new LinkedHashMap<>();
		map.put(11,"Geet");
		map.put(12, "Satish");
		map.put(11, "Uma");
		
		//System.out.println(map);
		
		Set set = map.entrySet();
		System.out.println("Entry set : ");
		for(Object i : set) {
			System.out.println(i);
		}
		
		Set<Integer> keyset = map.keySet();
		System.out.println("Key Set : ");
		for(Integer i :keyset ) {
			System.out.println(i);
		}
		
		
		Collection<String> values = map.values();
		System.out.println("Values : ");
		for(String s : values) {
			System.out.println(s);
		}
		
	}
}
