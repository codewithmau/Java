package com.arraylist.problem;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector<>();
//		v.add(10);
//		v.addElement(10);
//		v.add("Rahul");
//	    v.add(null);
		
		System.out.println(v.capacity());
		for(int i=1;i<=10;i++) {
			
			v.addElement(i);
		
		}
	   
		v.addElement(11);
		
	    System.out.println(v);
	    System.out.println("Capacity : " + v.capacity());
	    System.out.println("Size : " + v.size());
	    
	    
	    Vector v2 = new Vector<>();
	    
        for(int i=1;i<=45;i++) {
			
			v2.addElement(i);
		}
	   
		//v2.addElement(46);
		
	    //System.out.println(v);
	    System.out.println("Capacity : " + v2.capacity());
	    System.out.println("Size : " + v2.size());
	}
}
