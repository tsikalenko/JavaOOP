package com.gmail.tsikalenko.nikita;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}
