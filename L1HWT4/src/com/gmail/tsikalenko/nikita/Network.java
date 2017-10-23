package com.gmail.tsikalenko.nikita;

public class Network {
	private static StringBuilder sb = new StringBuilder();

	public static void addNumber(long number) {
		String n = "";
		n += number;
		if (sb.indexOf(n) == -1) {
			sb.append(n).append(" ");
		}
	}
	
	public static boolean find(long number) {
		String n = "";
		n += number;
		if(sb.indexOf(n) == -1) {
			return false;
		} else {
			return true;
		}
	}
}
