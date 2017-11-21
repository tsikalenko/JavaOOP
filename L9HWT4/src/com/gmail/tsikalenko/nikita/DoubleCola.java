package com.gmail.tsikalenko.nikita;

import java.util.ArrayList;
import java.util.List;

public class DoubleCola {
	List<String> arr = new ArrayList<>();

	public DoubleCola() {
		super();
		arr.add("Sheldon");
		arr.add("Leonard");
		arr.add("Volovitc");
		arr.add("Kutrapalli");
		arr.add("Penny");
	}

	@Override
	public String toString() {
		return "DoubleCola [arr=" + arr + "]";
	}

	public void startDrink(int numbers) {
		for (int i = 0; i < numbers; i++) {
			drink();
		}
	}

	public void drink() {
		arr.add(arr.get(0));
		arr.add(arr.get(0));
		arr.remove(0);
	}
	
	public void remove() {
		arr.removeAll(arr);

		arr.add("Sheldon");
		arr.add("Leonard");
		arr.add("Volovitc");
		arr.add("Kutrapalli");
		arr.add("Penny");
	}
}
