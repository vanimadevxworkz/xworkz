package com.xworkz.test.things;

public class School {
	public String name;
	public int  totalStudent;
	public short teachers;
	public String principleName;
	public int totalRooms;
	
	 public School() {
		 System.out.println("this is default constructor");
	 }
	
	public School(String name,int totalStudent,short teachers,String principleName,int totalRooms) {
		System.out.println("this is parameterized constructor");
		this.name=name;
		this.totalStudent=totalStudent;
		this.teachers=teachers;
		this.principleName=principleName;
		this.totalRooms=totalRooms;
		
		System.out.println(this.name);
		System.out.println(this.totalStudent);
		System.out.println(this.teachers);
		System.out.println(this.principleName);
		System.out.println(this.totalRooms);
		
	}
}
	

