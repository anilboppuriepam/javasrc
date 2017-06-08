package com.epam.domain;

import java.util.Stack;

import com.epam.interfaces.IHoldable;

public class Folder extends Stationery implements IHoldable, Comparable {
	private double price;
	private Stack<Stationery> file = new Stack<>();

	public Folder() {
		// TODO Auto-generated constructor stub
	}

	public Folder(double price) {
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
	public void hold(Stationery stationery) {

		file.push(stationery);

	}

	public File getFile() {

		return (File) (file.pop());
	}

	private class File extends Stationery {
		// this class is unimplemented and only represents a Stationery file
		// type
		// private int index;
		// private String content; // for writing some content or can be
		// replaced later by a reference to file instance

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Folder:" + price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Folder ref = (Folder) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;

	}
}
