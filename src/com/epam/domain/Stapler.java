package com.epam.domain;

public class Stapler extends Stationery implements Comparable {
	
	
	private boolean hasPins;

	public Stapler() {
		
	}

	public Stapler(double price, boolean hasPins) {
		super(price);
		
		this.hasPins = hasPins;
	}

	public boolean staple() {

		return hasPins;
	}

	@Override
	public String toString() {
		
		return "Stapler:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {
		Stapler ref = (Stapler) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
