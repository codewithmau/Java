package com.setexamples;

import java.util.HashSet;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		boolean result1 = set.add("uma");
		boolean result2=set.add("uma");
		set.add(10);
		set.add('a');
		set.add(null);
		set.add(10);//Repetative not allowed,insertion order is not preserved
//		
//		System.out.println(result1);
//		System.out.println(result2 );
//		
//		
//		System.out.println(set);
		
		
		for(Object o : set) {
			System.out.println(o);
		}
	}

}
