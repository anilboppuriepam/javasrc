package com.epam.domain;

import java.util.Stack;

import com.epam.interfaces.IHoldable;

public class Folder extends Stationery implements IHoldable, Comparable {
	
	private Stack<Stationery> file = new Stack<>();

	public Folder() {
		
	}

	public Folder(double price) {
		super(price);

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
	
		return "Folder:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {
		
		Folder ref = (Folder) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;

	}
}
