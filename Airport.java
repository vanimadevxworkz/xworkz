package com.xworkz.test.things;

public class Airport {
	private String flightName;
	private int numberOfPassanger;
	private int numberOfFilates;
	private int flightTime;
	
	public void setFlightName(String flightName) {
		this.flightName=flightName;
	}
	public void setNumberOfPassanger(int numberOfPassanger) {
		this.numberOfPassanger=numberOfPassanger;
	}
	public void setNumberOfFilates(int numberOfFilates) {
		this.numberOfFilates=numberOfFilates;
	}
	public void setFlightTime(int flightTime) {
     this.flightTime=flightTime;
}
	public String getFlightName() {
		return this.flightName;
	}
	public int getNumberOfPassanger() {
		return this.numberOfPassanger;
	}
	public int getNumberOfFilates() {
		return this.numberOfFilates;
	}
	public int getFlightTime() {
		return this.flightTime;
	}
}
