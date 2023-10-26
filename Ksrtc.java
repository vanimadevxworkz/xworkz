package com.xworkz.test.things;

public class Ksrtc {
private String busName;
private String busNumber;
private int numberOfSeats;
private String to;
private String from;

public Ksrtc() {
	System.out.println("default constructor");
}
public Ksrtc( String busName,String busNumber, int numberOfSeats,String to,String from) {
	this.busName=busName;
	this.busNumber=busNumber;
	this.numberOfSeats=numberOfSeats;
	this.to=to;
	this.from=from;
}
public void setBusName(String busName) {
	this.busName=busName;
}
public void setBusNumber(String busNumber) {
	this.busNumber=busNumber;
}
public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats=numberOfSeats;
}
public void setTo(String to) {
	this.to=to;
}
public void setFrom(String from) {
	this.from=from;
}
public String getBusName() {
	return this.busName;
}
public String getBusNumber() {
	return this.busNumber;
}
public int getNumberOfSeats() {
	return this.numberOfSeats;
}
public String getTo() {
	return this.to;
}
public String getFrom() {
	return this.from;
}
}

