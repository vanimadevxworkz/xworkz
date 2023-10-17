package com.xworkz.test.driver;

import com.xworkz.test.things.Hostel;

public class HostelRunner {
	public static void main(String args[]) {
		Hostel hostel=new Hostel();
		System.out.println(hostel.name);
		System.out.println(hostel.hostelFees);
		System.out.println(hostel.staffs);
		System.out.println(hostel.wardenName);
		System.out.println(hostel.totalRooms);
		 
		Hostel hostel1=new Hostel();
		hostel1.name="ppc";
		hostel1.hostelFees=2200;
		hostel1.staffs=5;
		hostel1.wardenName="savita";
		hostel1.totalRooms=7;
        System.out.println(hostel1.name);
	    System.out.println(hostel1.hostelFees);
		System.out.println(hostel1.staffs);
		System.out.println(hostel1.wardenName);
		System.out.println(hostel1.totalRooms);
			
		Hostel hostel2=new Hostel();
		hostel2.name="mgm";
		hostel2.hostelFees=2000;
		hostel2.staffs=4;
		hostel2.wardenName="lata";
		hostel2.totalRooms=4;
		 System.out.println(hostel2.name);
		System.out.println(hostel2.hostelFees);
		System.out.println(hostel2.staffs);
		System.out.println(hostel2.wardenName);
		System.out.println(hostel2.totalRooms);
		Hostel hostel3=new Hostel();
		hostel3.name="baliga";
		hostel3.hostelFees=2500;
		hostel3.staffs=5;
		hostel3.wardenName="usha";
		hostel3.totalRooms=4;
		 System.out.println(hostel3.name);
		System.out.println(hostel3.hostelFees);
		System.out.println(hostel3.staffs);
		System.out.println(hostel3.wardenName);
		System.out.println(hostel3.totalRooms);
				
		Hostel hoste4=new Hostel();
		System.out.println(hoste4.name);
		System.out.println(hoste4.hostelFees);
		System.out.println(hoste4.staffs);
		System.out.println(hoste4.wardenName);
		System.out.println(hoste4.totalRooms);
		
		  new Hostel();
			
		new Hostel("baliga",250,(short)10,"usha",(byte)9);
	}
}

					
					 		     
