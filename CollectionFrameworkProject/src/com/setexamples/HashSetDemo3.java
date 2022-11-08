package com.setexamples;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(10);
		set.add("jeet");
		set.add('s');
		set.add("Pune");
		set.add(null);
		set.add(23);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.remove(23));
		System.out.println(set.size());
		System.out.println(set);
		
		
	}
}
