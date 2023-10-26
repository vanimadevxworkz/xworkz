package com.xworkz.test.driver;

import com.xworkz.test.things.Airport;

public class AirportRunner {
public static void main(String args[]) {
	 Airport airport=new Airport();
	airport.setFlightName("indigo");
	airport.setNumberOfPassanger(100);
	airport.setNumberOfFilates(2);
	airport.setFlightTime(10);
	
	
	String flightName=airport.getFlightName();
	System.out.println(flightName);
	
	int numberOfPassanger=airport.getNumberOfPassanger();
	System.out.println(numberOfPassanger);
	
	int numberOfFilates=airport.getNumberOfFilates();
	System.out.println(numberOfFilates);
	
	int flightTime=airport.getFlightTime();
	System.out.println(flightTime);
		
}
}
