package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ñount {
	private List<Letter> list = new ArrayList<>();

	public Ñount() {
		super();
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Letter letter : list) {
			sb.append(letter).append(System.lineSeparator());
		}
		return sb.toString();
	}


	public void addLetter(File file) {
		String text = FileReader.read(file);
		for(char i = 'a'; i <= 'z'; i++) {
			if(text.indexOf((char)i) != -1){
				list.add(new Letter((char)i, Ñount.countLetter(text, (char)i)));
			}
		}
		Collections.sort(list);
	}
	
	public static int countLetter(String text, char letter) {
		int n = 0;
		for (char c : text.toCharArray()) {
			if(c == letter) {
				n++;
			}
		}
		return n;
	}
//	private List<Character> stringToList(char[] arr) {
//		List<Character> list = new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) {
//			list.add(arr[i]);
//		}
//		return list;
//	}
//
//	public void addLetter(File file) {
//		createSymbolList();
//		list = stringToList(FileReader.read(file).toCharArray());
//		list.removeAll(symbol);
//		
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		
//		System.out.println();
//		
//		for (char i = 'b'; i <= 'z'; i++) {
//			
//			System.out.println((char)(i-1));
//			System.out.println("index = " + list.indexOf(i));
//			
//			if (list.indexOf(i) != -1) {
//				
//				int count = list.indexOf(i);
//				
//				System.out.println(count);
//				System.out.println((char)(i - 1) + " -- " + (count));
//				
//				redy.add((char)(i-1));
//				list.removeAll(redy);
//			}
//			
//			System.out.println(list);
//			System.out.println();
//		
//		}
//	}

//	public void createSymbolList() {
//		symbol.add(' ');
//		symbol.add('.');
//		symbol.add(',');
//		symbol.add('!');
//		symbol.add('?');
//		symbol.add(':');
//		symbol.add(';');
//	}

}
