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


}
