package com.gmail.tsikalenko.nikita;

public abstract class Shape {

	public abstract double getPerimetr();

	public abstract double getArea();
	
	public double getSide(Point a, Point b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}

}
