package com.map.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//duplicate keys are not allowed but values allowed
		
		Map map = new LinkedHashMap<>();
		map.put(11, "Vinit");
		map.put(11,"geeta");
		map.put(77,"Geet");
		map.put("Raj",62);
		map.put(null, null);//not allow
	    map.put(13, null);
	    map.put(null, 12);
	    map.put(23,78);
	    map.put(34,"Geet");
	    
	    
	    System.out.println(map);
	}
}
