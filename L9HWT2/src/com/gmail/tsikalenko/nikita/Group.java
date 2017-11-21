package com.gmail.tsikalenko.nikita;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Group implements Voekom, Serializable {

	private static final long serialVersionUID = 1L;
	// private Student[] students = new Student[10];
	private List<Student> students = new ArrayList<>();

	public Group() {
		super();
	}

	public void addStudent(Student newStudent) throws GroupException {
		if (newStudent != null) {
			if (students.size() < 10) {
				students.add(newStudent);
				return;
			}
			throw new GroupException();
		}
	}

	public void interactivAdd() throws GroupException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input first name:");
		String firstName = sc.nextLine();
		System.out.println("Input last name:");
		String lastName = sc.nextLine();
		System.out.println("Age:");
		int age = sc.nextInt();
		System.out.println("Input rating:");
		int rating = sc.nextInt();
		Student newStudent = new Student(firstName, lastName, age, rating);

		if (students.size() < 10) {
			students.add(newStudent);
			return;
		}
		throw new GroupException();
	}

	public void deleteStudent(String firstName) {
		boolean studentDelete = false;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getFirstName().equals(firstName)) {
				students.remove(i);
				studentDelete = true;
				break;
			}

		}
		if (studentDelete) {
			System.out.println("Student " + firstName + " delete");
		} else {
			System.out.println("Student " + firstName + " not found");
		}
	}

	public Student findStudent(String firstName) {
		for (Student student : students) {
			if (student != null && student.getFirstName().equals(firstName)) {
				return student;
			}
		}
		return null;
	}

	private void sort() {
		int c = choseSort();
		if (c == 1) {
			Collections.sort(students, new SortByFirstName());
		} else if(c == 2) {
			Collections.sort(students, new SortByRating());
		}
			}

	private int choseSort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sort first name enter 1");
		System.out.println("Sort rating enter 2");
		int c = sc.nextInt();
		if (c == 1) {
			return 1;
		} else if (c == 2) {
			return 2;
		}
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sort();
		for (Student student : students) {
			if (student != null) {
				sb.append(student).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	@Override
	public List<Student> eighteenPlus() {
		List<Student> stud = new ArrayList<>(); 
		for (Student student : stud) {
			if(student.getAge() >= 18) {
				stud.add(student);
			}
		}
		return stud;
	}

}