package com.arraylist.problem;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class ArrayListDemo {
	
	public static void main(String[] args) {
	//collection printing way
    // ArrayList <Integer> al = new ArrayList();
     LinkedList <Integer> al = new LinkedList<Integer>();
	 
      al.add(10);
	  al.add(20);
	  al.add(30);
	  
	     System.out.println("Direct");
   	     System.out.println(al);
	
	     System.out.println("Traditional for-Loop");
	        for( int i=0;i<al.size();i++) {
		      System.out.println(al.get(i));  
	     }
	        
	     System.out.println("foreach loop");
	     for(int s : al) {
		   
		 System.out.println(s);
	   }
	     
	    System.out.println("Using Iterator");
	    Iterator<Integer> itr = al.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	   ListIterator<Integer> litr = al.listIterator();
	  
	}
}
