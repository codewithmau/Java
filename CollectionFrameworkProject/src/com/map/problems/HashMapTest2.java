package com.map.problems;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {

	public Map<Integer,String> add(Integer key,String value){
		Map<Integer,String> mapObject = new HashMap<>();
		mapObject.put(key,value);
		
		return mapObject;	
	}
	public static void main(String[] args) {
		HashMapTest2 test = new HashMapTest2();
		Map<Integer,String> map = test.add(10,"Uma");
		Map<Integer,String> map1 = test.add(11,"Komal");
		Map<Integer,String> map2 = test.add(12,"Geet");
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.putAll(map);
		hm.putAll(map1);
		hm.putAll(map2);
		
		System.out.println(hm);
		
	}
}
