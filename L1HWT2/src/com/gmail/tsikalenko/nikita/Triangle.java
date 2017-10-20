package com.gmail.tsikalenko.nikita;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getsideA() {
		return sideA;
	}

	public void setsideA(double sideA) {
		this.sideA = sideA;
	}

	public double getsideB() {
		return sideB;
	}

	public void setsideB(double sideB) {
		this.sideB = sideB;
	}

	public double getsideC() {
		return sideC;
	}

	public void setsideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}

	public double square() {
		double p = (sideA + sideB + sideC) / 2;
		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

}
