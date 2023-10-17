package com.xworkz.test.things;

public class Sweet {
	public String name;
	public int  totalSweet;
	public short price;
	public String bakeryName;
	public int totalBill;
	
	 public Sweet() {
		 System.out.println("this is default constructor");
	 }
	
	public Sweet(String name,int totalSweett,short price,String bakeryName,int totalBill) {
		System.out.println("this is parameterized constructor");
		this.name=name;
		this.totalSweet=totalSweet;
		this. price= price;
		this.bakeryName=bakeryName;
		this.totalBill=totalBill;
		
		System.out.println(this.name);
		System.out.println(this.totalSweet);
		System.out.println(this.price);
		System.out.println(this.bakeryName);
		System.out.println(this.totalBill);
		
	}
}

