package com.gmail.tsikalenko.nikita;

public class Letter implements Comparable<Letter>{
	private char letter;
	private int number;
	
	public Letter(char letter, int number) {
		super();
		this.letter = letter;
		this.number = number;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return letter + " -- " + number + ";";
	}

	@Override
	public int compareTo(Letter o) {
		return -(this.number - o.number);
	}
	
	
}
