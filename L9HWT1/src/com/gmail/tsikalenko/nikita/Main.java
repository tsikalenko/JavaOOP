package com.gmail.tsikalenko.nikita;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listWorker();
	}
	public static void listWorker() {
		List<Object> arr = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			arr.add(i+1);
		}
		
		arr.remove(0);
		arr.remove(0);
		arr.remove(arr.size()-1);
		
		System.out.println(arr);
	}
}
