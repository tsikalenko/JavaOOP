package com.gmail.tsikalenko.nikita;

import java.io.File;

public class Translater {
	public static void translate(File fileIn, File fileOut, Dictionary dictionary) {
		String[] text = FileWorker.read(fileIn).toLowerCase().split("[ ,.?!]");
		
		
		StringBuilder sb = new StringBuilder();
		for(String str : text) {
			if(dictionary.getDictionary().get(str) != null) {
				sb.append(dictionary.getDictionary().get(str)).append(" ");
			} else {
				sb.append(str);
			}
		}
		
		FileWorker.write(sb.toString(), fileOut);
	}
}
