package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Shoes;

public class ShoesRunner {
public static void main(String[] args) {
	Shoes shoes=new Shoes();
	Shoes shoes1=new Shoes();
	
	System.out.println("get class mehthod:"+shoes.getClass());
	System.out.println("object values:"+shoes.toString());
	System.out.println("shoes hash code:"+shoes.hashCode());
	System.out.println("shoes1 hash code:"+shoes1.hashCode());
	System.out.println(shoes.equals(shoes));
}
}
