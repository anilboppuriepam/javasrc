package com.epam.domain;

import com.epam.interfaces.IHiglighter;

public class Marker extends Stationery implements IHiglighter{

	public Marker() {
		
	}

	public Marker(String color, double price) {
		super(color,price);
	}

	@Override
	public String toString() {
	
		return "Marker:" + this.getColor() + this.getPrice();
	}

	@Override
	public void write() {
		

	}

	@Override
	public String highlite(String text) {
	
		return null;
	}


}
