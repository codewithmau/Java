package com.arraylist.problem;

import java.util.Vector;

public class VectorDemo2 {
	
  public static void main(String[] args) {
	
	  Vector<String> vector= new Vector<String>();
	  vector.add("Ram");
	  vector.add("velocity");
	  vector.add("Pune");
	  vector.add("Pune");
	  
	  while(vector.contains("Pune")) {
	  vector.remove("Pune");
	  }
	  
	 
	  vector.addElement("Miraj");
	  
	  System.out.println("new vector is="+vector);
	  System.out.println("vector size="+vector.size());
	  System.out.println("vector capacity="+vector.capacity());
	  System.out.println("index="+vector.get(1));
 
  }
}
