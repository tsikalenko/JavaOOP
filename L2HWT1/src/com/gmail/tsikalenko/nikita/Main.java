package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		Desk d1 = new Desk("My Desk");
		
		Point pt1 = new Point(2, 3);
		Point pt2 = new Point(5, 6);
		Point pt3 = new Point(1, 3);
		
		Triangle t1 = new Triangle(pt1, pt2, pt3);
		
		Point pr1 = new Point(2, 3);
		Point pr2 = new Point(5, 3);
		Point pr3 = new Point(2, 7);
		Point pr4 = new Point(5, 7);
		
		Rectangle r1 = new Rectangle(pr1, pr2, pr3, pr4);
		
		Point pco = new Point(0, 0);
		Point pcr = new Point(3, 3);
		
		Circle c1 = new Circle(pco, pcr);
		
		d1.addFigure(c1, 1);
		d1.addFigure(t1, 0);
		d1.addFigure(r1, 3);
		
		System.out.println(d1);
		
		d1.delFigure(3);
		
		System.out.println(d1);
	}

}
