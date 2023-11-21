package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Toy;

public class ToyRunner {
	public static void main(String[] args) {
		Toy toy=new Toy();
		Toy toy1=new Toy();
		

		System.out.println("get class method:"+toy.getClass());
		System.out.println("object class method:"+toy.toString());
		System.out.println("pen hash code method:"+toy.hashCode());
		System.out.println("pen1 hash code method:"+toy1.hashCode());
		//System.out.println(toy.equals(toy));
		System.out.println(toy.equals(toy1));
	}

}
