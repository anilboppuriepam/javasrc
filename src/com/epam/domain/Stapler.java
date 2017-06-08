package com.epam.domain;

public class Stapler extends Stationery implements Comparable {

	private double price;
	private boolean hasPins;

	public Stapler() {
		// TODO Auto-generated constructor stub
	}

	public Stapler(double price, boolean hasPins) {
		super();
		this.price = price;
		this.hasPins = hasPins;
	}

	public boolean staple() {

		return hasPins;
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
		return "Stapler:" + price;
	}

	@Override
	public int compareTo(Object o) {
		Stapler ref = (Stapler) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
