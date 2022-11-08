package com.map.problems;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(10,"abc");
		//ht.put(20, null);
		//ht.put(20, null);
		//ht.put(null, null);
		ht.put(20, "abc");
		 ht.put(10,"Uma");
		ht.put(11,"Uma");
		ht.put(10,"Uma");
		
		
		System.out.println(ht);
		
	}
}
