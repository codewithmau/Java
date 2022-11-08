package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.comparator.project.IdComparator;

public class TestMain {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(111,"Nitin",43,new Address("Pune","Gandhi Road",55)));	
		list.add(new Employee(109,"Gajesh",33,new Address("Pune","Bolwad Road",11)));
		list.add(new Employee(106,"Pritam",77,new Address("Pune","Pushpraj Chowk",46)));
		list.add(new Employee(108,"Vinu",35,new Address("Pune","Bramhanpuri Road",31)));
		
		for(Employee e : list) {
			
			System.out.println(e);
		}
		
		System.out.println("Sorted List By Age: ============================================================");
		
		Collections.sort(list,new AgeComparator());
		
		//System.out.println(list);
	      for(Employee e : list) {
			System.out.println(e);
          }
	      
			
			/*
			 * System.out.
			 * println("Sorted List By ID : ============================================================"
			 * );
			 * 
			 * Collections.sort(list,new IdComparator());
			 * 
			 * //System.out.println(list); for(Employee e : list) { System.out.println(e); }
			 */
			 
				/*
				 * System.out.
				 * println("Sorted List By Address : ============================================================"
				 * );
				 * 
				 * Collections.sort(list,new AddressComparator());
				 * 
				 * System.out.println(list);
				 */	
		      
		 System.out.println("Sorted List By Name : ============================================================");
				
		 Collections.sort(list,new NameComparator());
						
		     //System.out.println(list);	
			  for(Employee e : list) {
					System.out.println(e);
			  }
	}
	
}
