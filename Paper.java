package com.xworkz.Shopping.things;

public class Paper extends Craft {
	@Override
	public void getCraftInfo() {
		System.out.println("added new mwthod method");
	}
	
	public void getCraftType(String craftType) {
	System.out.println("this is get craft type info");
}
	
	public void getCraftPrice(int totalcraft) {
		System.out.println("this is total Craft info method");
	}

}
