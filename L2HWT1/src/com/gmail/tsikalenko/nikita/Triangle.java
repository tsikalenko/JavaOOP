package com.gmail.tsikalenko.nikita;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "perimetr=" + getPerimetr() + 
				"area=" + getArea() + "]";
	}

	@Override
	public double getPerimetr() {
		return getSide(a, b) + getSide(a, c) + getSide(c, b);
	}

	@Override
	public double getArea() {
		double p = getPerimetr() / 2;
		return Math.sqrt((p - getSide(a, b)) * (p - getSide(a, c)) * (p - getSide(c, b)));
	}

}
