package com.gmail.tsikalenko.nikita;

public class Group {
	private String name;
	private Student[] students = new Student[10];

	public Group(String name) {
		super();
		this.name = name;
	}

	public Group() {
		super();
	}

	public void addStudent(Student newStudent) throws GroupException {
		if (newStudent != null) {
			if (students[9] != null) {
				throw new GroupException();
			}
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = newStudent;
					break;
				}
			}
		}
	}

	public void deleteStudent(Student student) {
		boolean studentDelete = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].toString().equals(student.toString())) {
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
			System.out.println(student + " delete");
		} else {
			System.out.println("Student not found");
		}
	}

	public String findStudent(String firstName) {
		String s = "";
		boolean found = false;
		for (Student student : students) {
			if (student != null) {
				if (student.getFirstName().equals(firstName)) {
					s = student.toString();
					found = true;
					break;
				}
			}
		}
		if (!found) {
			s = "Student not found";
		}
		return s;
	}

	private void sort() {
		for (int i = 1; i < students.length; i++) {
			if (students[i] != null) {
				int imin = i - 1;
				for (int j = i; j < students.length; j++) {
					if (students[j] != null) {
						if (comparison(students[imin], students[j]) == 2) {
							imin = j;
						}
					} else {
						break;
					}

				}
				Student swap = new Student();
				if (imin != i - 1) {
					swap = students[i - 1];
					students[i - 1] = students[imin];
					students[imin] = swap;
				}
			} else {
				break;
			}
		}
	}

	public int comparison(Student s1, Student s2) {
		char[] sc1 = s1.getFirstName().toCharArray();
		char[] sc2 = s2.getFirstName().toCharArray();
		int length;
		if (sc1.length < sc2.length) {
			length = sc1.length;
		} else {
			length = sc2.length;
		}
		for (int i = 0; i < length; i++) {
			if (sc1[i] < sc2[i]) {
				return 1;
			} else if (sc1[i] > sc2[i]) {
				return 2;
			}
		}
		return 1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(System.lineSeparator());
		sort();
		int count = 1;
		for (Student student : students) {
			if (student != null) {
				sb.append(count++ + ") ").append(student).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

}
