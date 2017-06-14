package com.epam.domain;

public class Pen extends Stationery {

	
	public Pen() {

	}

	public Pen(double price, String color) {
		super(color, price);
	}

	@Override
	public String toString() {

		return "Pen:" + this.getColor()+this.getPrice();

	}

	
}
