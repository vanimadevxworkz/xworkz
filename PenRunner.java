package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Pen;

public class PenRunner {
	public static void main(String[] args) {
		Pen pen=new Pen();
		Pen pen1=new Pen();
		
		System.out.println("get class method:"+pen.getClass());
		System.out.println("object class method:"+pen.toString());
		System.out.println("pen hash code method:"+pen.hashCode());
		System.out.println("pen1 hash code method:"+pen1.hashCode());
		System.out.println(pen.equals(pen));
		//System.out.println(pen.equals(pen1));
 
		
	}

}
