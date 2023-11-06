package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Bus;
import com.xworkz.Shopping.things.Manufacture;

public class TransportRunner {

	public static void main(String[] args) {
		
		Manufacture m=new Manufacture();
		m.busName="ksrtc";
		m.price=500;
		m.totalPeople=60;
		m.expDate="25dec";
		m.Year="2014";
		
		
		Bus b=new Bus();
		b.totalBus=50;
		b.vehicalName="bus";
		
		System.out.println(m.busName);
		System.out.println(m.expDate);
		System.out.println(m.price);
		System.out.println(m.totalPeople);
		System.out.println(m.Year);
		System.out.println(b.totalBus);
		System.out.println(b.vehicalName);
	
		
	}
}
