package com.arraylist.problem;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		//Add with generic
		ArrayList<Integer> al = new ArrayList();
		al.add(10); //0
		al.add(12); //1
		
		//al.add(new Student(101,"uma"));
	
		int a = 55; //autoboxing=int=>Integer
		al.add(a); //2
		
		System.out.println(al.set(1,32)); //index 1 position set element 32
		al.add(10); //duplicates allowed
		al.add(null);//3 = null allowed here
		al.add(3,82);
		al.add(35);
	
		System.out.println(al.indexOf(100));//If element  are not present in list then it always gives output is -1
		System.out.println(al.indexOf(32));//find index
		
		System.out.println(al.remove(4));
		System.out.println(al.get(4));//find element of index position
		//System.out.println(al.get(6)); ArrayIndexOutOfBoundException
		
		System.out.println(al.size());
		System.out.println(al);
		
	}

}
