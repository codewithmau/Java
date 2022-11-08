package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		//Taking 5 mobile no from user and print it
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 mobile numbers :");
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			
		list.add(sc.next());	
	 }
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
