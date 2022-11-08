package com.demo;

import java.util.ArrayList;

/*Duplicates are allowed
 * Heterogeneous objects are allowed
 * Insertion order is preserved
 * 'N' number of null insertion is allowed  */


public class ArrayListDemo {

	public static void main(String[] args) {
		//Without add generic
		ArrayList al = new ArrayList<>();//capacity=10 
		al.add(39);
		al.add("Koyna");
		al.add(39);
		al.add(new Student(1,"Pune"));
		Student emp = new Student(2,"Sangli");//creating object 
		al.add(null);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		
	}
}
