package com.epam.domain;

import com.epam.interfaces.IWritable;

public class Pencil extends Stationery implements IWritable{
	


	public Pencil() {
		
	}

	public Pencil(double price, String color) {
		super(color,price);
	}

	@Override
	public void write() {

		System.out.println("writing in " + this.getColor());
	}

	@Override
	public String toString() {
		
		return "Pencil:" + this.getColor()+ this.getPrice();
	}

	
}
