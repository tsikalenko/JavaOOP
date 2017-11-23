package com.gmail.tsikalenko.nikita;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	private String name;
	private Map<String, String> dictionary = new HashMap<>();

	public Dictionary(String name, Map<String, String> dictionary) {
		super();
		this.name = name;
		this.dictionary = dictionary;
	}
	
	public Dictionary(String name) {
		super();
		this.name = name;
	}

	public Dictionary() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Map<String, String> getDictionary() {
		return dictionary;
	}

	@Override
	public String toString() {
		return name + " dictionary " + dictionary;
	}
	
	public void add(String word, String translate) {
		if((word == null) || (translate == null)) {
			throw new IllegalArgumentException();
		}
		dictionary.put(word, translate);
	}
}
