package com.comparable.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopMain {
	
	public static void main(String[] args) {
		
		List <Laptop> list = new ArrayList<Laptop>();
		list.add(new Laptop(16,"HP",30000));
		list.add(new Laptop(8,"Apple",49600));
		list.add(new Laptop(32,"Dell",67900));
		list.add(new Laptop(4,"Acer",22000));
		
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		
		Collections.sort(list);
		for(Laptop l : list) {
			
			System.out.println(l);
		}
		
	}

}
