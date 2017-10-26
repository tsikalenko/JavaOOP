package com.gmail.tsikalenko.nikita;

public class Desk {
	private String name;
	private Shape[] desk = new Shape[4];

	public Desk(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesk(Shape[] desk) {
		this.desk = desk;
	}

	public void addFigure(Shape f, int numberPlace) {
		if(numberPlace - 1 >= 0 && numberPlace - 1 < 4)
		if (desk[numberPlace - 1] == null) {
			desk[numberPlace - 1] = f;
		} else {
			System.out.println("Sorry, place " + numberPlace + " is dice!");
		}
	}

	public void delFigure(int numberPlace) {
		if (desk[numberPlace - 1] != null && numberPlace - 1 >= 0 && numberPlace < 4) {
			desk[numberPlace - 1] = null;
			System.out.println("Shape deleted");
		} else {
			System.out.println("Place is free");
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		double allArea = 0;
		sb.append(name).append(System.lineSeparator());
		for (Shape shape : desk) {
			sb.append(count++).append(" )");
			if (shape != null) {
				sb.append(shape);
				allArea += shape.getArea();
			} else {
				sb.append("Place free");
			}
			sb.append(System.lineSeparator());
		}
		sb.append("Area all figure = ").append(allArea);
		return sb.toString();
	}

}
