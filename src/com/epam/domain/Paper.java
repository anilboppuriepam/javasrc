package com.epam.domain;

public class Paper extends Stationery implements Comparable {

	
public Paper(){
	
}
	public Paper(double price) {
		// TODO Auto-generated constructor stub
		super( price);
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Paper:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {
		Paper ref = (Paper) o;
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
