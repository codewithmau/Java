package com.arraylist.problem;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayLinked {

	public static void main(String[] args) {
		
	ArrayList<String> al = new ArrayList<>();
	
	al.add("Uma");
	al.add("Rahul");
	al.add("Sakshi");
	al.add("Kiran");
	
	
	LinkedList <String> list = new LinkedList();
	list.add("Java");
	list.add("Python");
	list.add("JavaScript");
	list.add("Raspberry pi");
	
	System.out.println("ArrayList : " + al);
	System.out.println("LinkedList : " + list);
	
	}
}
