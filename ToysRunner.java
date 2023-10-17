package com.xworkz.test.driver;
import  com.xworkz.test.things.Toys;
public class ToysRunner {
	public static void main(String args[]) {
		Toys toys1=new Toys();
		System.out.println(toys1);
		Toys toys2=new Toys();
		System.out.println(toys2);
		Toys toys3=new Toys();
		System.out.println(toys3);
		System.out.println(new Toys()); 
	}

}
