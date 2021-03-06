package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWorker {

	public static String read(File file) {
		StringBuilder sb = new StringBuilder();
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				sb.append(sc.nextLine()).append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void write(String text, File file) {
		try (PrintWriter a = new PrintWriter(file)) {
			a.println(text);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}
	}
	
	public static void saveObject(Object obj, File file) {
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(obj);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public static Object loadObject(File file) {
		try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
			return ois.readObject();
		} catch (Exception e) {
			return null;
		}
	}

}
