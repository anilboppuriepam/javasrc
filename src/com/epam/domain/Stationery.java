package com.epam.domain;

import com.epam.domain.Clip;

@SuppressWarnings("rawtypes")
public abstract class Stationery implements Comparable {

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

	@Override
	public int compareTo(Object o) {
		int result = 0;
		Stationery ref = null;
		if (o != null && o instanceof Clip) {
			ref = (Clip) o;
			if (this.getPrice() > ref.getPrice())
				result = 1;
			else if (this.getPrice() < ref.getPrice())
				result = -1;
			else
				result = 0;
		} else if (o != null && o instanceof Folder) {
			ref = (Folder) o;
			if (this.getPrice() > ref.getPrice())
				result = 1;
			else if (this.getPrice() < ref.getPrice())
				result = -1;
			else
				result = 0;
		} else if (o != null && o instanceof Marker) {
			ref = (Marker) o;
			if (this.getPrice() > ref.getPrice())
				result = 1;
			else if (this.getPrice() < ref.getPrice())
				result = -1;
			else
				result = 0;
		} else if (o != null && o instanceof Paper) {
			ref = (Paper) o;
			if (this.getPrice() > ref.getPrice())
				result = 1;
			else if (this.getPrice() < ref.getPrice())
				result = -1;
			else
				result = 0;
		} else if (o != null && o instanceof Pen) {
			ref = (Pen) o;
			if (this.getPrice() > ref.getPrice())
				result = 1;
			else if (this.getPrice() < ref.getPrice())
				result = -1;
			else
				result = 0;
		} else if (o != null && o instanceof Pencil) {
			ref = (Pencil) o;
			if (this.getPrice() > ref.getPrice())
				result = 1;
			else if (this.getPrice() < ref.getPrice())
				result = -1;
			else
				result = 0;
		} else if (o != null && o instanceof Pin) {
			ref = (Pin) o;
			if (this.getPrice() > ref.getPrice())
				result = 1;
			else if (this.getPrice() < ref.getPrice())
				result = -1;
			else
				result = 0;
		} else if (o != null && o instanceof StickNote) {
			ref = (StickNote) o;
			if (this.getPrice() > ref.getPrice())
				result = 1;
			else if (this.getPrice() < ref.getPrice())
				result = -1;
			else
				result = 0;
		}
		return result;
	}
}
