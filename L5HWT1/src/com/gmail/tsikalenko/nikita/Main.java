package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File in = new File("E:/�����/Java_�����/Folder");
		File out = new File("E:/�����/Java_�����/JavaCourses");
		try {
			CopyFile.copy(out, in, "docx");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
