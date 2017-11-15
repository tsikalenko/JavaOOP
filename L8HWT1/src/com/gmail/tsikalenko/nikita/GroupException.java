package com.gmail.tsikalenko.nikita;

import java.io.Serializable;

public class GroupException extends Exception implements Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return " Group is full";
	}
	
}
