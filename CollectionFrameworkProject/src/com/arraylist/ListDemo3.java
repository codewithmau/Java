package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo3 {
public static void main(String[] args) {
	
	//Sorting arraylist in Ascending order
	
	//Parent p = new Child();
	
	List<String> list = new ArrayList();
	list.add("Uma");
	list.add("Vishal");
	list.add("Rahul");
	list.add("Mrunali");
	list.add("Geet");
	list.add("Vinayak");
	list.add("Ashwini");
	list.add(1, "iii");
	
	
	System.out.println("Before sorting : ");
	for(String s : list) {
		System.out.println(s);
	}
	
	Collections.sort(list);
	
	System.out.println("After sorting : ");
	for(String s : list) {
		System.out.println(s);
	}
	
	
  }	
	
}
