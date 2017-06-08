package com.epam.domain;

import com.epam.interfaces.IWritable;

public class Pencil extends Stationery implements IWritable, Comparable {

	private double price;
	private String color = "black";

	public Pencil() {
		// TODO Auto-generated constructor stub
	}

	public Pencil(double price, String color) {
		super();
		this.price = price;
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pencil(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void write() {

		System.out.println("writing in " + color);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pencil:" + price;
	}

	@Override
	public int compareTo(Object o) {
		Pencil ref = (Pencil) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
