package com.gmail.tsikalenko.nikita;

public class ASCIIart {
	public static void print(String text) {
		Font font = new Font();
		
		for (int i = 0; i < 6; i++) {
			for (char letter : text.toLowerCase().toCharArray()) {
				System.out.print(font.getStar().get(letter).get(i));
			}
			System.out.println();
		}
	}
}
