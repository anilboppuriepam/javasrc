package com.epam.domain;

import java.util.HashSet;
import java.util.Set;

import com.epam.interfaces.IHoldable;

public class Clip extends Stationery implements IHoldable, Comparable {

	private double price;

	public Clip(double price) {
		super(price);
	}

	Set<Stationery> papersSet = new HashSet<>();

	@Override
	public void hold(Stationery stationery) {

		if (stationery instanceof Paper)
			papersSet.add(stationery);

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set getPapersSet() {

		return this.papersSet;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Clip:" + price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Clip ref = (Clip) o;
		if (this.price > ref.getPrice())
			return 1;
		else if (this.price < ref.getPrice())
			return -1;
		else
			return 0;

	}
}
