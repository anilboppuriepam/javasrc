package com.epam.domain;

import com.epam.interfaces.IEditable;

public class StickNote extends Stationery implements IEditable, Comparable {

	
	private StringBuilder content = new StringBuilder();
	private static int NOTE_CAPACITY = 100;

	public StickNote() {
	
	}

	public StickNote(double price) {
		super(price);
		
	}
	
	@Override
	public StringBuilder edit(StringBuilder text) {
		if (text.length() < NOTE_CAPACITY) {

			content = text;
			NOTE_CAPACITY -= text.length();
		} else
			throw new RuntimeException("Text exceeds the capacity"
					+ (NOTE_CAPACITY - text.length()));
		return getText();
	}

	@Override
	public StringBuilder getText() {
		
		return content;
	}

	@Override
	public String toString() {
	
		return "StickNote:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {
		StickNote ref = (StickNote) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;

	}
}
