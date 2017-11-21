package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	public static String read(File file) {
		StringBuilder sb = new StringBuilder();
		try (Scanner sc = new Scanner(file)){
			for(;sc.hasNextLine();) {
				sb.append(sc.nextLine());
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		return sb.toString();
	}
}
