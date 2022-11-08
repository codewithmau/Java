package com.arraylist.problem;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack =new Stack<>();
		
		System.out.println(stack.capacity());
		
		stack.push("U");//adding elements in LIFO manner
		stack.push("M");
		stack.push("A");
	
		
		System.out.println(stack);
		
		stack.pop();//remove last add element
		System.out.println(stack);
		
		stack.push("s");
		stack.push("T");
		System.out.println(stack);
		
		System.out.println(stack.peek());//only prints top element not removed
		
		int element = stack.search("U");
		System.out.println(element);
		
		
	}
}
 