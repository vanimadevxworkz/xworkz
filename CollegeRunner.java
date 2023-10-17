package com.xworkz.test.driver;

import com.xworkz.test.things.College;

public class CollegeRunner {
	public static void main(String args[]) {
		College college=new College();
		System.out.println(college.name);
		System.out.println(college.totalFees);
		System.out.println(college.staffs);
		System.out.println(college.color);
		System.out.println(college.totalRooms);
		 
		College college1=new College();
		 college1.name="ppc";
		 college1.totalFees=22000;
		 college1.staffs=25;
		 college1.color=true;
		 college1.totalRooms=20;
		 System.out.println(college1.name); 
			System.out.println(college1.totalFees);
			System.out.println(college1.staffs);
			System.out.println(college1.color);
			System.out.println(college1.totalRooms);
		
			College college2=new College();
			 college2.name="mgm";
			 college2.totalFees=2000;
			 college2.staffs=15;
			 college2.color=true;
			 college2.totalRooms=25;
			 System.out.println(college2.name);
				System.out.println(college2.totalFees);
				System.out.println(college2.staffs);
				System.out.println(college2.color);
				System.out.println(college2.totalRooms);
				
				College college3=new College();
				 college3.name="womens";
				 college3.totalFees=4000;
				 college3.staffs=20;
				 college3.color=true;
				 college3.totalRooms=12;
				 System.out.println(college3.name);
					System.out.println(college3.totalFees);
					System.out.println(college3.staffs);
					System.out.println(college3.color);
					System.out.println(college3.totalRooms);
				
					College college4=new College();
					System.out.println(college4.name);
					System.out.println(college4.totalFees);
					System.out.println(college4.staffs);
					System.out.println(college4.color);
					System.out.println(college4.totalRooms);
					
					new College();
					
					new College("beena",25000,(short)10,true,(byte)9);
	}
}
					
					 		          
			
		 
      
	

