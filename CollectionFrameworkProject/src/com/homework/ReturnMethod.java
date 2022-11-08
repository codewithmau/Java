package com.homework;

import java.util.HashMap;
import java.util.Set;

public class ReturnMethod {

	public HashMap<Integer,String> add(){
	HashMap<Integer,String> map = new HashMap<>();
	  map.put(10, "Uma");
	  map.put(20, "Gagesh");
	  map.put(30, "Kanak");
	  map.put(40, "Payal");
	
	   return map;//map object 
	
	}
	
	public static void main(String[] args) {
		
		ReturnMethod test = new ReturnMethod();
		HashMap<Integer,String> map = test.add();
		
		Set<Integer> set = map.keySet();
		for(Integer i : set) {
			
			System.out.println("Keyset :" + i);
			System.out.println("Values :" + map.get(i));
		}
	}
	
}
