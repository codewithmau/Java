package com.arraylist.problem;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo2 {
  
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);  //0
		al.add(20);  //1
		al.add(30);  //2
		
		System.out.println("ArrayList Elements : " + al);
	
		LinkedList list = new LinkedList<>(al);
		list.add(40);
		list.add(50);
		list.add(60);
		
		//list.addAll(al); //2nd collection add addAll()method
		
		System.out.println("LinkedList Elements : " + list);
		System.out.println("Using addAll() method : " + list);
		
	}
}
