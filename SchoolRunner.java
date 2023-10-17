package com.xworkz.test.driver;
import  com.xworkz.test.things.School;

public class SchoolRunner {
	public static void main(String args[]) {
		School school=new School();
		System.out.println(school.name);
		System.out.println(school.totalStudent);
		System.out.println(school.teachers);
		System.out.println(school.principleName);
		System.out.println(school.totalRooms);
      
		//create a object
		School school1=new School();
		school1.name="ppc";
		school1.totalStudent=500;
		school1.teachers=20;
		school1.principleName="ramu";
		school1.totalRooms=10;
		
		System.out.println(school1.name);
		System.out.println(school1.totalStudent);
		System.out.println(school1.teachers);
		System.out.println(school1.principleName);
		System.out.println(school1.totalRooms);
      
		School school2=new School();
		school2.name="siddarth";
		school2.totalStudent=450;
		school2.teachers=10;
		school2.principleName="Archna";
		school2.totalRooms=8;
		
		System.out.println(school2.name);
		System.out.println(school2.totalStudent);
		System.out.println(school2.teachers);
		System.out.println(school2.principleName);
		System.out.println(school2.totalRooms);
      
		School school3=new School();
		school3.name="honnegadde";
		school3.totalStudent=100;
		school3.teachers=6;
		school3.principleName="sanjeev";
		school3.totalRooms=12;
		
		System.out.println(school3.name);
		System.out.println(school3.totalStudent);
		System.out.println(school3.teachers);
		System.out.println(school3.principleName);
		System.out.println(school3.totalRooms);
        
		School school4=new School();
		System.out.println(school4.name);
		System.out.println(school4.totalStudent);
		System.out.println(school4.teachers);
		System.out.println(school4.principleName);
		System.out.println(school4.totalRooms);
		
		 new School();
      
		new School("vip",300,(short)8,"vasu",9);
	}

}
