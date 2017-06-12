package com.epam.domain;

public abstract class Stationery {

	private static int itemID;
	private double price;
	private String color = "";

	public Stationery() {

	}

	public Stationery(double price){
		
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

}
