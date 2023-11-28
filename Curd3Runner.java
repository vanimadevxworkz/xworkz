package com.xworkz.interview.driver;

import com.xworkz.interview.things.Curd3;

public class Curd3Runner {
	
	public static void main(String[] args) {
		Curd3 curd=new Curd3();
		System.out.println("this is get insert method");
		curd.getInsert(25.0);
		curd.getInsert(30.0);
		
		System.out.println("this is get read method");
		curd.read();
		
		System.out.println("this is get update method");
		curd.getUpdate(25.0, 35.5);
		curd.read();
		
		System.out.println("this is get delete method");
		curd.getDelete(35.5);
		curd.read();
		
	}

}
