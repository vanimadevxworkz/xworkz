package com.xworkz.test.driver;

import com.xworkz.test.things.Food;

public class FoodRunner {
	public static void main(String args[]) {
		Food.foodName();
		Food.rate();
		Food.price();
		Food.hotel();
		Food.name("chickenBiriyani");
		Food.rate(100);
		Food.hotel("kidiyooru");
		String name =Food.name();
		System.out.println(name);
		double foodRate=Food.foodRate();
		System.out.println(foodRate);
		float discount=Food.discount();
		System.out.println(discount);
		String hotelName=Food.hotelName();	
		System.out.println(hotelName);
		String itemName=Food.getItemName("alfma");
		System.out.println(itemName);
		int itemRate=Food.getItemRate(200);
		System.out.println(itemRate);
		String hotelNames=Food.getHotelNames("zara");
		System.out.println(hotelNames);
		int thing=Food.getThing(150);
		System.out.println(thing);
	}
}
		
		
		
		
	


