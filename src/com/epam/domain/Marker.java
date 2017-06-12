package com.epam.domain;

import com.epam.interfaces.IHiglighter;

public class Marker extends Stationery implements IHiglighter, Comparable {

	private String color;
	

	public Marker() {
		// TODO Auto-generated constructor stub
	}

	public Marker(String color, double price) {
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
		// TODO Auto-generated method stub
		return "Marker:" + this.getPrice();
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
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}
}