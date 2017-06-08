package com.epam.domain;

import com.epam.interfaces.IHiglighter;

public class Marker extends Stationery implements IHiglighter, Comparable {

	private String color;
	private double price;

	public Marker() {
		// TODO Auto-generated constructor stub
	}

	public Marker(String color, double price) {
		super();
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marker:" + price;
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub

	}

	@Override
	public String highlite(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Marker ref = (Marker) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
