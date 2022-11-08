package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ChkNoInList {

	public static void main(String[] args) {
		//H.W
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(29);
		list.add(34);
		list.add(46);
		list.add(12);
		
		System.out.println(list.contains(46));
	}
}
