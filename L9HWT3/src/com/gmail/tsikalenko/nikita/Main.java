package com.gmail.tsikalenko.nikita;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("a.txt");
		�ount count = new �ount();
		count.addLetter(file);
		System.out.println(count);
	}

}
