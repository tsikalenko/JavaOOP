package com.gmail.tsikalenko.nikita;

import java.util.ArrayList;

public class BlackList {
	private ArrayList<Class<?>> blackList = new ArrayList<>();

	public BlackList(ArrayList<Class<?>> blackList) {
		super();
		this.blackList = blackList;
	}

	public BlackList() {
		super();
	}

	public void add(Class<?> class1) {
		blackList.add(class1);
	}

	public void remove(int index) {
		blackList.remove(index);
	}

	public Class<?> get(int index) {
		return blackList.get(index);
	}

	public void set(int index, Class<?> type) {
		blackList.set(index, type);
	}
	
	public boolean check(Class<?> type) {
		for (Class<?> class1 : blackList) {
			if(class1 == type) {
				return true;
			}
		}
		return false;
	}
}
