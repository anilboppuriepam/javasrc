package com.epam.domain;

public class Pen extends Stationery implements Comparable {
	
	private String color = "blue";

	public Pen() {
	
	}

	public Pen(double price, String color) {
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
	public String toString() {
		
		return "Pen:" + this.getPrice();
		
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
