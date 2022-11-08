package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentArrayListDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id : ");
		System.out.println("Enter student name : ");
		System.out.println("Enter student marks : ");
		
        List<String> list = new ArrayList<>();
		'''l,'
	
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
		
	}

}
