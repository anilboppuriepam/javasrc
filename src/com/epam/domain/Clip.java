package com.epam.domain;

import java.util.HashSet;
import java.util.Set;

import com.epam.interfaces.IHoldable;

public class Clip extends Stationery implements IHoldable {

	public Clip(double price) {
		super(price);
	}

	Set<Stationery> papersSet = new HashSet<>();

	@Override
	public void hold(Stationery stationery) {

		if (stationery instanceof Paper)
			papersSet.add(stationery);

	}

	public Set<Stationery> getPapersSet() {

		return this.papersSet;
	}

	@Override
	public String toString() {

		return "Clip:" + this.getPrice();
	}

	
}
