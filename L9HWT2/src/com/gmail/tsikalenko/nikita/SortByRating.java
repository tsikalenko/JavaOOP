package com.gmail.tsikalenko.nikita;

import java.util.Comparator;

public class SortByRating implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -(o1.getRating() - o2.getRating());
	}
	
}
