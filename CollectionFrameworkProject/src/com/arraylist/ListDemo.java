package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
//program for copy one arraylist into another arraylist
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
	
		ArrayList<Integer> al2 = new ArrayList();
		al2.add(40);
		al2.add(50);
		al2.add(60);
		
		al.addAll(al2);
		//System.out.println(al);
		
		System.out.println(al.contains(10)); 
		
		Iterator<Integer> itr = al.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
