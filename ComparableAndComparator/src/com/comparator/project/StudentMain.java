package com.comparator.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentMain {

	public static void main(String[] args) {
		
		List <Student> list = new ArrayList<Student>();
		list.add(new Student(1004,"Vinay","Pune"));
		list.add(new Student(1011,"Gajesh","Goa"));
		list.add(new Student(1008,"Priya","Mumbai"));
		list.add(new Student(1002,"Geet","Belgum"));
		
		//1st arraylist sorted by id
		
		Collections.sort(list,new IdComparator());
		//System.out.println(list);
		for(Student s : list) {
			
			System.out.println(s);
		}
		
		//2nd arraylist created and sorted by name
		
		List <Student> list1 = new ArrayList<Student>(list);
		
		Collections.sort(list1,new NameComparator());
        for(Student s : list1) {
			
			System.out.println(s);
		}
	}
}
