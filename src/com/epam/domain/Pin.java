package com.epam.domain;

//public class Pin extends Stationery implements Comparable {
	public class Pin extends Stationery {

	public Pin(double price) {
		super(price);
		
	}
	@Override
	public String toString() {
		
		return "Pin:" + this.getPrice();
	}

	/*@Override
	public int compareTo(Object o) {
		Pin ref = (Pin) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}*/

}
