package com.xworkz.test.driver;

import com.xworkz.test.things.Coffees;
import com.xworkz.test.things.Milk;
import com.xworkz.test.things.Coffeepowder;

public class CoffeesRunner {
	public static void main(String args[]) {
		Coffees coffees=new Coffees();
		Milk milk=new Milk();
		milk.setMilkType("goodlife");
		milk.setPrice(42);
		milk.setLiters(2.0f);
		
		Coffeepowder coffeepowder=new Coffeepowder();
		coffeepowder.setType("levista");
		coffeepowder.setPrice(25);
		coffeepowder.setGram(100.0f);
		
		coffees.setMilk(milk);
			System.out.println(coffees.getMilk().getMilkType());
			System.out.println(coffees.getMilk().getPrice());
			System.out.println(coffees.getMilk().getLiters());
			
			coffees.setCoffeepowder(coffeepowder);
			System.out.println(coffees.getCoffeepowder().getType());
			System.out.println(coffees.getCoffeepowder().getPrice());
			System.out.println(coffees.getCoffeepowder().getGram());
			
		}
		}


