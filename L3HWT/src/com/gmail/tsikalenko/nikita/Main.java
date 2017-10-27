package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("A", "L1", 18, 5);
		Student s2 = new Student("B", "L2", 19, 4);
		Student s3 = new Student("C", "L3", 17, 5);
		Student s4 = new Student("D", "L4", 21, 3);
		Student s5 = new Student("E", "L5", 18, 4);
		Student s6 = new Student("H", "L1", 18, 5);
		Student s7 = new Student("I", "L2", 19, 4);
		Student s8 = new Student("J", "L3", 17, 5);
		Student s9 = new Student("K", "L4", 21, 3);
		Student s10 = new Student("L", "L5", 18, 4);
		Student s11 = new Student("M", "L5", 18, 4);

		Group g1 = new Group("G1");
		
		try {
			g1.addStudent(s1);
			g1.addStudent(s2);
			g1.addStudent(s5);
			g1.addStudent(s7);
			g1.addStudent(s3);
			g1.addStudent(s6);
			g1.addStudent(s4);
			g1.addStudent(s8);
			g1.addStudent(s11);
			g1.addStudent(s10);
			g1.addStudent(s9);
		} catch (GroupException e) {
			e.printStackTrace();
		}
		
		System.out.println(g1);
		
		g1.deleteStudent(s7);
		g1.deleteStudent(s9);
		
		System.out.println();
		System.out.println(g1);
		
		System.out.println(g1.findStudent("F6"));
		System.out.println(g1.findStudent("F3"));
	}

}
