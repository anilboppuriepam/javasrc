package com.epam.domain;

public class Paper extends Stationery implements Comparable{

	
public Paper(){
	
}
	public Paper(double price) {
		
		super( price);
	}

	
	@Override
	public String toString() {
		
		return "Paper:" + this.getPrice();
	}

	@Override
	public int compareTo(Object o) {
		Paper ref = (Paper) o;
		return compare(this.getPrice(), ref.getPrice());
	}
}
