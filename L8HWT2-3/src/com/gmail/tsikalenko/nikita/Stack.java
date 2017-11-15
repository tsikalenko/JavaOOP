package com.gmail.tsikalenko.nikita;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Object> arr = new ArrayList<>();

	public Stack() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Stack [arr= ");
		for (Object object : arr) {
			sb.append(object).append(" + ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		return sb.toString();
	}

	public void add(Object object, Class<?> type, BlackList bl) {
		if (!bl.check(type)) {
			arr.add(object);
		}
	}

	public void remove() {
		arr.remove(0);
	}

	public Object get() {
		return arr.get(0);
	}
}
