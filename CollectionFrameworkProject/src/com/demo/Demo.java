package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		Collection collection = new ArrayList<>();
		collection.add(10);
		collection.add("Uma");
		collection.add(20+30);
		collection.add(25*4);
		collection.add("Sakshi");
		collection.add("Uma");
		collection.add(new Student(101,"Rahul"));
		
		System.out.println(collection);
		
		List list = new ArrayList<>();
		list.add(24);
		list.add("Mali");
		list.add(35/3);
		list.add(new Student(101,"Geeta"));
		//list.add("Mali)"
				
		System.out.println(list);
		
	}
}
