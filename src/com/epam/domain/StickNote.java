package com.epam.domain;

import com.epam.interfaces.IEditable;

public class StickNote extends Stationery implements IEditable, Comparable {

	private double price;
	private StringBuilder content = new StringBuilder();
	private static int NOTE_CAPACITY = 100;

	public StickNote() {
		// TODO Auto-generated constructor stub
	}

	public StickNote(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
		// TODO Auto-generated method stub
		return content;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StickNote:" + price;
	}

	@Override
	public int compareTo(Object o) {
		StickNote ref = (StickNote) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;

	}
}
