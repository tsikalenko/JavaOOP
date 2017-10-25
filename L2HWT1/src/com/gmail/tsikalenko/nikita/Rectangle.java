package com.gmail.tsikalenko.nikita;

public class Rectangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rectangle() {
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

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + 
				"perimetr=" + getPerimetr() + "area=" + getArea() + "]";
	}

	@Override
	public double getPerimetr() {
		return getSide(a, b) + getSide(b, c) + getSide(d, c) + getSide(a, d);
	}

	@Override
	public double getArea() {
		double p = getPerimetr() / 2;
		return Math.sqrt((p - getSide(a, b)) * (p - getSide(b, c)) * (p - getSide(c, d)) * (p - getSide(a, d)));
	}

}
