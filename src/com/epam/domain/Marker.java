package com.epam.domain;

import com.epam.interfaces.IHiglighter;

public class Marker extends Stationery implements IHiglighter, Comparable {

	private String color;
	

	public Marker() {
		
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
	
		return "Marker:" + this.getPrice();
	}

	@Override
	public void write() {
		

	}

	@Override
	public String highlite(String text) {
	
		return null;
	}

	@Override
	public int compareTo(Object o) {
	
		Marker ref = (Marker) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
