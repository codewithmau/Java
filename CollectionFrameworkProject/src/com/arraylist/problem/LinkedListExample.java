package com.arraylist.problem;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		//Add without Generic
		
		LinkedList list = new LinkedList();
		list.add(10);     //0
		list.add("Uma");  //1
		list.add('R');    //2
		list.add(3,"Kumari");//3 - add elements index posiotion 3
		                     //size <= index / size==index is chked
		
		list.add(10);  //duplicates are allowed 
		list.add(null);
		list.add(4,"Veena");
		
		System.out.println(list.get(1));
		
		list.remove(6);
		list.addFirst("Sheetal");
		list.addLast("Vishal");
		
		//list.add(4,"Rahul");  Index in between size
		//list.add((new Student(101,"Geeta"));
		
		System.out.println(list);
		
	}
}
