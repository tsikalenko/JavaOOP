package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		Phone phone1 = new Phone("Xiaomi 3S", "DarkGray", 123);
		
		phone1.registrationInNetwork();
		
		Phone phone2 = new Phone("Xiaomi 4X", "Gold", 456);
		
		phone2.registrationInNetwork();
		
		Phone phone3 = new Phone("Maizu 5S", "Grey", 789);
		
		phone1.callOut(456);
		
		System.out.println();
		
		phone2.callOut(789);
	}

}
