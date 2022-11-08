package com.map.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo5 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("Uma","Mali");
		map.put("Veena","Kore");
		
	    //Iterator <String> itr1 = map.keySet().iterator(); == for key only
		//Iterator <String> itr1 = map.values().iterator(); == for values only	
		
		
		//Using iterator prints key-values
		Iterator<Map.Entry<String,String>> itr = map.entrySet().iterator(); //Both key-value store in 1 object
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<String,String> entryset = itr.next();
			System.out.println("Key : " + entryset.getKey() + "    " +  "value : " + entryset.getValue());
		
			if(entryset.getKey().equals("Uma")) {   //for updation
				entryset.setValue("More");
			}
		
		
		}
		
		
	}
}
