package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Group implements Voekom {
	private Student[] students = new Student[10];

	public Group() {
		super();
	}

	public void addStudent(Student newStudent) throws GroupException {
		if (newStudent != null) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = newStudent;
					return;
				}
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

		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = newStudent;
				return;
			}
		}
		throw new GroupException();
	}

	public void deleteStudent(String firstName) {
		boolean studentDelete = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getFirstName().equals(firstName)) {
					students[i] = null;
					studentDelete = true;
					for (int j = i + 1; j < students.length; j++) {
						if (students[j] != null) {
							students[j - 1] = students[j];
							students[j] = null;
						} else {
							break;
						}
					}
					break;
				}
			}
		}
		if (studentDelete) {
			System.out.println("Student " + firstName + " delete");
		} else {
			System.out.println("Student not found");
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
		for (int i = 1; i < students.length; i++) {
			int isort = i - 1;
			for (int j = i; j < students.length; j++) {
				if (c == 1) {
					if (comparisonLastName(students[isort], students[j]) == 1) {
						isort = j;
					}
				} else if (c == 2) {
					if (comparisonRating(students[isort], students[j]) == -1) {
						isort = j;
					}
				}
			}
			Student swap = new Student();
			if (isort != i - 1) {
				swap = students[i - 1];
				students[i - 1] = students[isort];
				students[isort] = swap;
			}
		}
	}

	private int choseSort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sort lastname enter 1");
		System.out.println("Sort reiting enter 2");
		int c = sc.nextInt();
		if (c == 1) {
			return 1;
		} else if (c == 2) {
			return 2;
		}
		return 0;
	}

	private int comparisonRating(Student s1, Student s2) {
		if (s1 != null && s2 != null) {
			if (s1.getRating() > s2.getRating()) {
				return 1;
			} else if (s1.getRating() < s2.getRating()) {
				return -1;
			}
		}
		return 0;
	}

	private int comparisonLastName(Student s1, Student s2) {
		if (s1 != null && s2 != null) {
			if (s1.getFirstName().compareTo(s2.getFirstName()) > 0) {
				return 1;
			} else if (s1.getFirstName().compareTo(s2.getFirstName()) < 0) {
				return -1;
			}
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
	public Student[] eighteenPlus() {
		Student[] studArr = new Student[10];
		int count = 0;
		for (int i = 0; i < studArr.length; i++) {
			if (students[i] != null && students[i].getAge() >= 18) {
				studArr[count++] = students[i];
			}
		}
		return studArr;
	}

	public void groupToFile(File file) {
		try (PrintWriter a = new PrintWriter(file)) {
			a.println(toString());
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}
	}

	public void fileToGroup(File file) { 
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				String[] s = sc.nextLine().split("[,]");
				if (!s[0].equals("")) {
					try {
						addStudent(new Student(s[0], s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3])));
					} catch (GroupException e) {
						e.printStackTrace();
					}
				} else {
					return;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}