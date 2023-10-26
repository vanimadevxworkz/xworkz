package com.xworkz.test.driver;

import com.xworkz.test.things.Ksrtc;

public class KsrtcRunner {
	public static void main(String args[]) {
		Ksrtc ksrtc=new Ksrtc();
		ksrtc.setBusName("shrikumar");
		ksrtc.setBusNumber("KA 47 1948");
		ksrtc.setNumberOfSeats(50);
		ksrtc.setTo("benglore");
		ksrtc.setFrom("bhatkal");
		
		String busName=ksrtc.getBusName();
		System.out.println(busName);
		
		String busNumber =ksrtc.getBusNumber();
		System.out.println(busNumber);
		
		int numberOfSeats=ksrtc.getNumberOfSeats();
		System.out.println(numberOfSeats);
		
		String to=ksrtc.getTo();
		System.out.println(to);
		
		String from=ksrtc.getFrom();
		System.out.println(from);
		
	}

}
