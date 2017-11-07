package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWorker {
	public static void merger(File f1, File f2, File f3) {
		String[] s1 = readFile(f1).split("[ ,.!?]");
		String s2 = readFile(f2);
		StringBuilder sb = new StringBuilder();
		for (String string : s1) {
			if (s2.lastIndexOf(string) != -1) {
				sb.append(string).append(" ");
			}
		}
		writeToFile(f3, sb.toString());
	}

	private static String readFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				sb.append(sc.nextLine()).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}

	private static void writeToFile(File file, String string) {
		try (PrintWriter a = new PrintWriter(file)) {
			a.println(string);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}

	}
}
