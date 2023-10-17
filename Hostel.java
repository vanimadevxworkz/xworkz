package com.xworkz.test.things;

public class Hostel {
	public String name;
	public int  hostelFees;
	public short staffs;
	public String wardenName;
	public byte totalRooms;
	
	 public Hostel() {
		 System.out.println("this is default constructor");
	 }
	
	public Hostel(String name,int totalFees,short staffs,String wardenName,byte totalRooms) {
		System.out.println("this is parameterized constructor");
		this.name=name;
		this.hostelFees=hostelFees;
		this.staffs=staffs;
		this.wardenName=wardenName;
		this.totalRooms=totalRooms;
		
		System.out.println(this.name);
		System.out.println(this.hostelFees);
		System.out.println(this.staffs);
		System.out.println(this.wardenName);
		System.out.println(this.totalRooms);
		
	}	

}
