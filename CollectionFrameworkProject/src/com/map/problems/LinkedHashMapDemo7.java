package com.map.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo7 {

public static void main(String[] args) {
		
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(20,"Mali");
		map.put(50,"More");
		map.put(50,"Gore");
		
		map.forEach((K,V)-> System.out.println("Key : " + K + "   "  + "Values : " + V));
		
		
		//System.out.println(map);
    }
}
