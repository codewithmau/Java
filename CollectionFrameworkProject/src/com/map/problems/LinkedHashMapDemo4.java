package com.map.problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo4 {

	public static void main(String[] args) {
		
       Map <Integer,String> map = new LinkedHashMap<>();
       map.put(10,"More");
       map.put(20, "Kore");
       map.put(30, "Gore");
       map.put(40, "Pore");
       
		
		  Set<Integer> set = map.keySet();
		   System.out.println("get key: "); 
		   for(Integer i : set) 
		   { 
			   System.out.println(i); System.out.println(map.get(i));
		   }
		 
       
       //System.out.println(map.get(20));
		
	}
}
