package com.map.problems;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest1 {
	
	public HashMap<Integer,String> add(){
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(11,"Peru");
		map.put(12,"Chikoo");
		map.put(13,"Golu");
		
		return map;
	}
	
	public static void main(String[] args) {
		
	HashMapTest1 test = new HashMapTest1();
	HashMap<Integer,String> map = test.add();
	
	Set<Integer> set = map.keySet();
	for(Integer i : set) {
		System.out.println("keys:" + i);
		System.out.println("values :" + map.get(i));
		m
		
	}
	
  }
}
