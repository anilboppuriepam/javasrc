package com.epam.domain;

public class Paper extends Stationery{

	
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
		if (this.getPrice() > ref.getPrice())
			return 1;
		else if (this.getPrice() < ref.getPrice())
			return -1;
		else
			return 0;
	}
}
