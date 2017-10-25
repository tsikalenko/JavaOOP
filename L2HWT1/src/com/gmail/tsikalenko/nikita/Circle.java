package com.gmail.tsikalenko.nikita;

public class Circle extends Shape {
	private Point o;
	private Point r;

	public Circle(Point o, Point r) {
		super();
		this.o = o;
		this.r = r;
	}

	public Circle() {
		super();
	}

	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}

	public Point getR() {
		return r;
	}

	public void setR(Point r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [o=" + o + ", r=" + r + "perimetr=" + getPerimetr() + "area=" + getArea() + "]";
	}

	@Override
	public double getPerimetr() {
		return 2 * getSide(o, r) * Math.PI;
	}

	@Override
	public double getArea() {
		return Math.pow(getSide(r, o),2)*Math.PI;
	}

}
