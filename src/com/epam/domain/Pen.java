package com.epam.domain;

public class Pen extends Stationery implements Comparable {

	
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
		return compare(this.getPrice(), ref.getPrice());
	}
}
