package com.gmail.tsikalenko.nikita;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s1 = new Stack();
		
		BlackList bl1 = new BlackList();
		bl1.add(int.class);
		
		s1.add("qwerty", String.class, bl1);
		s1.add(4, int.class, bl1);
		s1.add(56, int.class, bl1);
		s1.add(new File("a.txt"), File.class, bl1);

		System.out.println(s1);

		s1.remove();

		System.out.println(s1);
	}

}
