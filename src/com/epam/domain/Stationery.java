package com.epam.domain;

import com.epam.domain.Clip;

@SuppressWarnings("rawtypes")
public abstract class Stationery implements Comparable<Stationery> {

	private static int itemID;
	private double price;
	private String color = "";

	public Stationery() {

	}

	public Stationery(double price) {

		this.price = price;
	}

	public Stationery(String color, double price) {

		++this.itemID;
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getItemID() {
		return itemID;
	}

	public static void setItemID(int itemID) {
		Stationery.itemID = itemID;
	}

	static int compare(double p1, double p2) {

		if (p1 > p2)
			return 1;
		else if (p1 < p2)
			return -1;
		else
			return 0;
	}

	@Override
	public int compareTo(Stationery o) {

		if (o != null && (this.price > o.getPrice()))
			return 1;
		else if (o != null && (this.price < o.getPrice()))
			return -1;
		else
			return 0;
	}

}
