package com.gmail.tsikalenko.nikita;

import java.math.BigInteger;

public class FactorialThreal implements Runnable {
	private int number;

	public FactorialThreal(int number) {
		super();
		this.number = number;
	}

	public FactorialThreal() {
		super();
	}

	private BigInteger calculateFactorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = n; i > 1; i--) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		for (int i = 1; i <= number; i++) {
			System.out.println(currentThread.getName() + " -> " + i + "! = " + calculateFactorial(i));
			if (currentThread.isInterrupted()) {
				System.out.println(currentThread.getName() + " is interrupted");
				return;
			}
		}
	}

}
