package com.epam.domain;

public class Pin extends Stationery implements Comparable {
	private double price;

	public Pin(double price) {
		super();
		this.price = price;
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
		return "Pin:" + price;
	}

	@Override
	public int compareTo(Object o) {
		Pin ref = (Pin) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;
	}

}
