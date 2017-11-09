package com.gmail.tsikalenko.nikita;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File in = new File("E:/Учеба/Java_курсы/Лекции.docx");
		File out = new File(in.getName());
		if(CopyFile.copyFile(in, out)) {
			System.out.println("File copy sucsesfull");
		} else {
			System.out.println("Error coppy");
		}
	}

}
