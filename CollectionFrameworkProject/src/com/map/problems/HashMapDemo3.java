package com.map.problems;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(10, "Uma");
		map.put(11,"Ram");
		map.put(13, "Vishal");
		
		//Values get using foreach loop
		
		Set <Integer> set = map.keySet();
		
		for(Integer i : set) {
			//System.out.println("keys" + i);
			System.out.println(map.get(i));
		}
		
		//System.out.println(map.get(11));//values return
	}
}
