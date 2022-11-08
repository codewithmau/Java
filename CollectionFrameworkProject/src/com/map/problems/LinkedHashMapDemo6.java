package com.map.problems;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo6 {

	public static void main(String[] args) {
		
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("Ritesh","Koil");
		map.put("Ram","Mane");
		map.put("Rajesh","Tare");
		map.put("Uma","Kolte");
		
		Iterator<Map.Entry<String,String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String,String> entryset = itr.next();
			{
				System.out.println("Key : " + entryset.getKey() +   "     "  + 
			                       "Values : " + entryset.getValue());
			}
			if(entryset.getKey().equals("Uma")) {
				entryset.setValue("Mali");
			}
		}
		
	}
}
