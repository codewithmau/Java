package com.map.problems;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo5 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "Uma");
		map.put(11,"Ram");
		map.put(13, "Rahul");
		map.put(12, "Uma");
		
	//	Set <Integer> set = map.keySet();
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("keys :" + i);
			System.out.println("Values " + map.get(i));
		}
		
		
		
	}
}
