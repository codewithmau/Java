package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo7 {

	public static void main(String[] args) {
		//H.W
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(13);
		list2.add(14);

		List<Integer> list3 = new ArrayList<>();
		list3.add(15);
		list3.add(16);
		
        //list3.addAll(list1);
		//list3.addAll(list2);
		
		 list1.addAll(list2);
		 list3.addAll(list1);
		
		System.out.println(list3);

	}
}
