package com.homework;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public Map <Integer,String> add(Integer key,String value){
		Map<Integer, String> mapObject = new HashMap<Integer, String>();
		mapObject.put(key,value);
		return mapObject ;
		
	}
	
	public static void main(String[] args) {
		HashMapTest test = new HashMapTest();
		Map<Integer,String>map1 = test.add(10,"Piyu");
		Map<Integer,String>map2 = test.add(20,"Geet");
		
		HashMap<Integer,String> map = new HashMap<>();
		map.putAll(map1);
		map.putAll(map2);
		
		System.out.println(map);
		
	}

}
