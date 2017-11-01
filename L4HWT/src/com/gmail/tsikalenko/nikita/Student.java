package com.gmail.tsikalenko.nikita;

public class Student extends Human{
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
		return "Student [rating=" + rating + super.toString();
	}

}
