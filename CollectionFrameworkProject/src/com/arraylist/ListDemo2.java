package com.arraylist;

import java.util.ArrayList;

public class ListDemo2 {
	//program for copy one arraylist into another arraylist

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add("XYZ");
		al.add(null);
		al.add(25);
		al.add('s');
		
	//for Heterogeneous elements use "Object"
		for(Object o : al) {
			System.out.println(o);
			
		}
		
	}
}
