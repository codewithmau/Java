package com.setexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo2 {
	
  public static void main(String[] args) {
	
	  List list = new ArrayList();
	  list.add(10);
	  list.add(10);
	  list.add("Uma");
	  list.add('s');
	  list.add(67);
	  list.add(null);
	  
	  System.out.println(list);
	  
	  Set set =new HashSet(list);
	  
	  System.out.println(set);
	  
   }
}
