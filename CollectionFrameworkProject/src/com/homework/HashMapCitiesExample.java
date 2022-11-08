package com.homework;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCitiesExample {

	public static void main(String[] args) {
		
		ArrayList<String> maharashtra = new ArrayList<>();
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nagpur");
	
		ArrayList<String> karnataka = new ArrayList<>();
		karnataka.add("Mysore");
		karnataka.add("Belgavi");
		karnataka.add("Belgum");

     	ArrayList<String> madhyapradesh = new ArrayList<>();
     	madhyapradesh.add("Bhopal");
     	madhyapradesh.add("Indore");
  
     	
     	HashMap<String,ArrayList<String>> mapObject = new HashMap<>();
     	mapObject.put("Maharashtra", maharashtra);
     	mapObject.put("Karnataka", karnataka);
     	mapObject.put("Madhyapradesh", madhyapradesh);
     	
     	//System.out.println(mapObject);

     	HashMap<String,HashMap<String,ArrayList<String>>> mapIndia = new HashMap<>();
     	mapIndia.put("India", mapObject);
     	
     	System.out.println(mapIndia);
     	
	}
}
