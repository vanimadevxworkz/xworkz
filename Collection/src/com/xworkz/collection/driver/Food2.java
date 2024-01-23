package com.xworkz.collection.driver;


import java.util.ArrayList;
import java.util.List;

public class Food2 {

	public static void main(String[] args) {
		List<String> foodList=new ArrayList<String>();
		
		foodList.add("pizza");
		foodList.add("burger");
		foodList.add("popcorn");
		foodList.add("cake");
		foodList.add("chips");
		foodList.add("donut");
		foodList.add("apple juice");
		foodList.add("cookies");
		foodList.add("omlets");
		foodList.add("bread omlets");
		foodList.add("biriyani");
		foodList.add("kabab");
		foodList.add("egg biriyani");
		foodList.add("alpma");
		foodList.add("noodles");
		foodList.add("friderice");
		foodList.add("egg noodles");
		foodList.add("chilly");
		foodList.add("soup");
		foodList.add("fish");
		foodList.add("chicken tikka masala");
		foodList.add("butter chicken");
		foodList.add("panner butter masala");
		foodList.add("grill");
		foodList.add("chicken65");
		foodList.add("kfc");
		foodList.add("chicken rolls");
		foodList.add("savarma");
		foodList.add("tandoori");
		foodList.add("curry");
		
		System.out.println(foodList);
		System.out.println("dose is present:"+foodList.contains("dose"));
		
		System.out.println("remove 20th food item:"+foodList.remove("fish"));
		System.out.println(foodList);
		
		System.out.println(foodList.size());
	}
}
