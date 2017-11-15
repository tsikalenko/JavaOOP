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
		} catch (GroupException e) {
			e.printStackTrace();
		}
		
		File file = new File("a.txt");
		
		FileWorker.saveObject(g1, file);
		
		Group g2 = (Group) FileWorker.loadObject(file);
		
		System.out.println(g2);
	}

}