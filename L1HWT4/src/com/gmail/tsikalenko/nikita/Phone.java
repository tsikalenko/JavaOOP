package com.gmail.tsikalenko.nikita;

public class Phone {
	private String model;
	private String color;
	private long number;
	
	public Phone(String model, String color, long number) {
		super();
		this.model = model;
		this.color = color;
		this.number = number;
	}

	public Phone() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", color=" + color + ", number=" + number + "]";
	}
	
	public void registrationInNetwork() {
		Network.addNumber(number);
	}
	
	public void callOut(long number) {
		if(Network.find(number)) {
			System.out.println("Caling: " + number);
		} else {
			System.out.println("Number " + number + " incorrect!");
		}
	}
}
