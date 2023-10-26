package com.xworkz.test.driver;

import com.xworkz.test.things.Dish;

public class DishRunner {
public static void main(String args[]) {
	Dish dish=new Dish();
	dish.setDishName("vvv");
	dish.setType((byte)2);
	dish.setPrice(30);
	dish.setQuantity(13);
	dish.setPlace("bhatkal");
	 
	String dishName=dish.getDishName();
	System.out.println(dishName);
	
	byte type =dish.getType();
	System.out.println(type);
	
	int price=dish.getPrice();
	System.out.println(price);
	
	int quantity=dish.getQuantity();
	System.out.println(quantity);
	
	String place=dish.getPlace();
	System.out.println(place);
}
}
