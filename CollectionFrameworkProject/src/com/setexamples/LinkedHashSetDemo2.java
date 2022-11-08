package com.setexamples;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		set.add(11);
		set.add("Geet");
		set.add(34);
		set.add("Geet");
		set.add('z');
		set.add(11);
		set.add(null);
		
		System.out.println(set);
		
		for(Object o : set) {
			System.out.println(o);
		}
		
	}
}
