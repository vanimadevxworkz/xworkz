package com.xworkz.test.things;

public class College {
	public String name;
	public int  totalFees;
	public short staffs;
	public boolean color;
	public byte totalRooms;
	
	 public College() {
		 System.out.println("this is default constructor");
	 }
	
	public College(String name,int totalFees,short staffs,boolean color,byte totalRooms) {
		System.out.println("this is parameterized constructor");
		this.name=name;
		this.totalFees=totalFees;
		this.staffs=staffs;
		this.color=color;
		this.totalRooms=totalRooms;
		
		System.out.println(this.name);
		System.out.println(this.totalFees);
		System.out.println(this.staffs);
		System.out.println(this.color);
		System.out.println(this.totalRooms);
		
	}
}
	
