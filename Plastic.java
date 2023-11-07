package com.xworkz.Shopping.things;

public class Plastic extends Paper {
	@Override
	public void getCraftInfo() {
		System.out.println("this is new added another method");
	}
	
	public void getCraftType(String craftName) {
	System.out.println("this is craft name info");
}
	
	public void getCraftPrice(int items) {
		System.out.println("this is items info method");
	}
}
