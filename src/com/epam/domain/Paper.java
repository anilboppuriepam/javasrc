package com.epam.domain;

public class Paper extends Stationery implements Comparable {

	private double price;

	public Paper(double price) {
		// TODO Auto-generated constructor stub
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
		return "Paper:" + price;
	}

	@Override
	public int compareTo(Object o) {
		Paper ref = (Paper) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
