package com.epam.domain;

public class Pen extends Stationery implements Comparable {
	private double price;
	private String color = "blue";

	public Pen() {
		// TODO Auto-generated constructor stub
	}

	public Pen(double price, String color) {
		super();
		this.price = price;
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pen:" + price;
	}

	@Override
	public int compareTo(Object o) {
		Pen ref = (Pen) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
