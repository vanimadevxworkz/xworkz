package com.xworkz.Shopping.things;

public class SouthFood extends Food {
	public String foodName;
	public int price;
	public boolean isGood;

	public void getFoodInfo(){
		super.name="chicken biriyani";
		super.price=120;
		super.types="non veg";
		
		System.out.println("food name is:"+super.name);
		System.out.println("food price is:"+super.price);
		System.out.println("food types is:"+super.types);
	}

}
