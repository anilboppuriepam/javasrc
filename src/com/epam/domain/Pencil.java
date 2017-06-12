package com.epam.domain;

import com.epam.interfaces.IWritable;

public class Pencil extends Stationery implements IWritable, Comparable {

	private String color = "black";

	public Pencil() {
		
	}

	public Pencil(double price, String color) {
		super(price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void write() {

		System.out.println("writing in " + color);
	}

	@Override
	public String toString() {
		
		return "Pencil:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {
		Pencil ref = (Pencil) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
