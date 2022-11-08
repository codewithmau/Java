package com.map.problems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<>();
		map.put(20, "vud");
		map.put(12, "pqr");
		map.put(13, "xyz");
		
		 //Methods to prints key-values(obj), keys, values using foreach loop
		
		Set set = map.entrySet();
		System.out.println("Entry set : ");
		for(Object o : set) {
			System.out.println(o);
		}
		
		Set <Integer> keyset = map.keySet();
		System.out.println("Key Set : ");
		for(Integer i : keyset) {
			System.out.println(i);
		}
		
		
		Collection <String> values = map.values();
		System.out.println("Values set : ");
		for(String s : values) {
			System.out.println(s);
		}
		
		
		//System.out.println(map);
		
	}
}
