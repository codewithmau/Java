package com.setexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetDemo3 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(10);
		set.add(10);
		set.add(34);
		
		System.out.println("Using foreach loop : ");
		for(Integer i : set) {
			System.out.println(i);
		}
		
		System.out.println("Using iterator : ");
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
	}
}
