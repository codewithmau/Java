package com.map.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo4 {

	public static void main(String[] args) {
		
		//HashMap <Integer,String> map = new HashMap<>();
		
		ConcurrentHashMap<Integer,String> map = new  
		map.put(10, "Uma");
		map.put(11,"Ram");
		map.put(13, "Vishal");
		
		//Values get using iterator
		
		Set <Integer> keyset = map.keySet();
		
		Iterator <Integer> itr = keyset.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("Keys : " + i);
			System.out.println("Values : "  + map.get(i));
			//map.put(20,"seeta");  java.util.ConcurrentModificationException
		}
		
		
	}
}
