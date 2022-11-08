package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		//Sorting arraylist in Descending order 
		
		List<String> list = new ArrayList();
		list.add("Uma");
		list.add("Vishal");
		list.add("Rahul");
		list.add("Mrunali");
		list.add("Geet");
		list.add("Vinayak");
		list.add("Ashwini");
		
		System.out.println("Before sorting");
		
		for(String s : list) {
			System.out.println(s);
			
		}
		
		Collections.sort(list);
		
	}
}
