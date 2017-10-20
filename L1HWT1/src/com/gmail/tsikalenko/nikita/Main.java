package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Cat1", 2, "White", 5);
		Cat cat2 = new Cat("Cat2", 3, "Red", 8);
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		cat1.myau();
	}

}
