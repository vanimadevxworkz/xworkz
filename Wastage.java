package com.xworkz.Shopping.things;

public class Wastage extends Plastic {
	@Override
	public void getCraftInfo() {
		System.out.println("added one more getCraft info method");
	}
	
	public void getCraftType(String typeName) {
	System.out.println("this is get craft type name info");
}
	
	public void getCraftPrice(int craftAmmount) {
		System.out.println("this is ammount info");
	}

}
