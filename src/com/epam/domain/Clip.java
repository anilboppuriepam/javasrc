package com.epam.domain;

import java.util.HashSet;
import java.util.Set;

import com.epam.interfaces.IHoldable;

public class Clip extends Stationery implements IHoldable, Comparable {

	public Clip(double price) {
		super(price);
	}

	Set<Stationery> papersSet = new HashSet<>();

	@Override
	public void hold(Stationery stationery) {

		if (stationery instanceof Paper)
			papersSet.add(stationery);

	}

	public Set getPapersSet() {

		return this.papersSet;
	}

	@Override
	public String toString() {

		return "Clip:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {

		Clip ref = (Clip) o;
		return compare(this.getPrice(), ref.getPrice());

	}
}
