package com.epam.domain;

public class Pin extends Stationery implements Comparable {

	public Pin(double price) {
		super(price);
		
	}
	@Override
	public String toString() {
		
		return "Pin:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {
		Pin ref = (Pin) o;
		return compare(this.getPrice(), ref.getPrice());
	}

}
