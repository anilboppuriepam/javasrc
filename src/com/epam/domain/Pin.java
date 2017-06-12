package com.epam.domain;

public class Pin extends Stationery implements Comparable {
	

	public Pin(double price) {
		super(price);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pin:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {
		Pin ref = (Pin) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}

}
