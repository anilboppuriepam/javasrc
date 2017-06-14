package com.epam.domain;

public class Pin extends Stationery {

	public Pin(double price) {
		super(price);
		
	}
	@Override
	public String toString() {
		
		return "Pin:" + this.getPrice();
	}

	
}
