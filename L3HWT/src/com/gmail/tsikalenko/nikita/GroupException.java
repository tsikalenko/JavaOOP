package com.gmail.tsikalenko.nikita;

public class GroupException extends Exception{

	@Override
	public String getMessage() {
		return " Group is full";
	}
	
}
