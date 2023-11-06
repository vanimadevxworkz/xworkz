package com.xworkz.Shopping.things;

public class Hotels extends SouthFood {
	public String hotelName;
	public String place;
	public int totalItem;
	
	public void getSouthFoodInfo() {
		super.foodName="roti";
		super.price=130;
		super.isGood=true;
		
		System.out.println("food name is:"+super.foodName);
		System.out.println("price is:"+super.price);
		System.out.println("food is good:"+super.isGood);
		
	}

}
