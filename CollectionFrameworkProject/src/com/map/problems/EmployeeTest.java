package com.map.problems;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	       System.out.println("Enter first string :");
	       String str1 = sc.nextLine();

	       
	       System.out.println("Enter second string :");
	       String str2 = sc.nextLine();

	       if(str1.length() == str2.length()){

	             char[] charArray1 = str1.toCharArray();
	             char[] charArray2 = str2.toCharArray2();

	          boolean result = Arrays.equals(charArray1.charArray2);
	         if(result){

	            System.out.println(str1 + "and" + str2 + "are anagram ");

	        } else 
	           {
	              
	              System.out.println(str1 + "and" + str2 + "are not anagram ");
	           }

	     } 
	         else{

	             System.out.println(str1 + "and" + str2 + "are not anagram "); 
	          } 
	     }


}
}
	  

		
	    	
		/*
		 * List<Integer> list = new ArrayList<Integer>(); list.add(10); list.add(20);
		 * list.add(30); list.add(40);
		 * 
		 * System.out.println("List :"+ list);
		 * 
		 * Collections.reverse(list);
		 * 
		 * System.out.println("Reverese arraylist:" + list);
		 */

	  
