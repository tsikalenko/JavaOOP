package com.gmail.tsikalenko.nikita;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		Group g1 = new Group();

		try {
			g1.addStudent(new Student("A", "L1", 18, 5));
			g1.addStudent(new Student("B", "L2", 19, 4));
			g1.addStudent(new Student("E", "L5", 18, 4));
			g1.addStudent(new Student("I", "L2", 19, 4));
			g1.addStudent(new Student("C", "L3", 17, 5));
			g1.addStudent(new Student("H", "L1", 18, 5));
			g1.addStudent(new Student("D", "L4", 21, 3));
			g1.addStudent(new Student("J", "L3", 17, 5));
			g1.addStudent(new Student("M", "L5", 18, 4));
			g1.addStudent(new Student("L", "L5", 18, 4));
			g1.addStudent(new Student("K", "L4", 21, 3));
		} catch (GroupException e) {
			e.printStackTrace();
		}

		System.out.println(g1);
//
//		g1.deleteStudent("J");
//		g1.deleteStudent("A");
//
//		System.out.println();
//
//		System.out.println(g1);
//
//		System.out.println(g1.findStudent("F6"));
//		System.out.println(g1.findStudent("A"));
//
//		System.out.println();
//
//		Student[] sArr = g1.eighteenPlus();
//		for (int i = 0; i < sArr.length; i++) {
//			System.out.println(sArr[i]);
//		}
//
//		try {
//			g1.interactivAdd();
//		} catch (GroupException e) {
//			e.printStackTrace();
//		}
		
		File file = new File("a.txt");
		g1.groupToFile(file);
		
		Group g2 = new Group();
		g2.fileToGroup(file);
		
		System.out.println(g2);
	}

}