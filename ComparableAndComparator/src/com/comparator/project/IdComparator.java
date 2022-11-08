package com.comparator.project;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		//return s1.getId() - s2.getId();
		
		if(s1.getId() == s2.getId())
			return 0;
		
		else if(s1.getId() > s2.getId())
			return 1;
		
		else
			return -1;
		
	}

}
