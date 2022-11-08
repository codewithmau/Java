package com.map.problems;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo6 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("Uma","Mali");
		map.put("Vinu","More");
		
		//Using foreach loop prints key-values
		map.forEach((k,v) -> System.out.println("key :" + k + " " + "value : " + v ));
	}
}
