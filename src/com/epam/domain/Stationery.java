package com.epam.domain;

public abstract class Stationery {

	private static int itemID; 
	private double price;
	
	public Stationery() {
	
	}
	public Stationery( double price) {
		
		++this.itemID;
		this.price = price;
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
