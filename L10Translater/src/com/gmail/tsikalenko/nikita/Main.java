package com.gmail.tsikalenko.nikita;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary("English - Russian");
		dictionary.add("hello", "ïðèâåò");
		dictionary.add("world", "ìèð");
		
		File in = new File("english.txt");
		File out = new File("russian.txt");
		
		Translater.translate(in, out, dictionary);
		
		File fileDictionary = new File("Dictionary.txt"); 
		FileWorker.saveObject(dictionary, fileDictionary);
	}
}
