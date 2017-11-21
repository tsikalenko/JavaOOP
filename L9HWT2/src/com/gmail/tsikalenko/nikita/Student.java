package com.gmail.tsikalenko.nikita;

import java.io.Serializable;
import java.util.Comparator;

public class Student extends Human implements Serializable, Comparator<Student> {

	private static final long serialVersionUID = 1L;
	private int rating;

	public Student(String firstName, String lastName, int age, int rating) {
		super(firstName, lastName, age);
		this.rating = rating;
	}

	public Student() {
		super();
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return super.toString() + "," + rating;
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
