package com.gmail.tsikalenko.nikita;

public class Main {
	public static void main(String[] args) {
		Thread[] t = new Thread[100];
		
		for (int i = 0; i < t.length; i++) {
			t[i]  = new Thread(new FactorialThreal(i));
			t[i].start();
		}
		
		Thread tm = Thread.currentThread();
		System.out.println(tm.getName() + " is Stop!!!");
	}
}
