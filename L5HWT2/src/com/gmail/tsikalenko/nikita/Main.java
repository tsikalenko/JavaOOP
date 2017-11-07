package com.gmail.tsikalenko.nikita;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File f1 = new File("f1.txt");
		File f2 = new File("f2.txt");
		File f3 = new File("f3.txt");
		FileWorker.merger(f1, f2, f3);
	}

}
