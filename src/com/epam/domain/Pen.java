package com.epam.domain;

public class Pen extends Stationery implements Comparable {

	private String color = "blue";

	public Pen() {

	}

	public Pen(double price, String color) {
		super(color, price);
	}

	@Override
	public String toString() {

		return "Pen:" + this.getColor()+this.getPrice();

	}

	@Override
	public int compareTo(Object o) {
		Pen ref = (Pen) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
