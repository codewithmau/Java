package com.map.problems;

import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
		TreeMap <String,Integer> map = new TreeMap<>();
		map.put("Vijay", 10);
		map.put("rahul", 27);
		map.put("Meet", 30);
		//map.put(null, 80);//Nullpointerexception
		map.put("ashwini",30);
		
		System.out.println(map);
		
	}
}
