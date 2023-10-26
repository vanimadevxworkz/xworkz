package com.xworkz.test.driver;


import com.xworkz.test.things.Coffee;

public class CoffeeRunner {
	public static void main(String args[]) {
		Coffee coffee=new Coffee();
		coffee.setBranchName("brue");
		coffee.setFlovers("chocalate");
		coffee.setPrice(25);
		coffee.setPlace("benglore");
		coffee.setQuantity(10);
		
		String branchName=coffee.getBranchName();
		System.out.println(branchName);
		
		String flovers =coffee.getFlovers();
		System.out.println(flovers);
		
		int price=coffee.getPrice();
		System.out.println(price);
		
		String place=coffee.getPlace();
		System.out.println(place);
		
		int quantity=coffee.getQuantity();
		System.out.println(quantity);
		
	}


}
