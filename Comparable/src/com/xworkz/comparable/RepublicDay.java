package com.xworkz.comparable;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class RepublicDay implements Comparable<RepublicDay> {

	
	private String location;
	private int numOfPeople;
	private Date date;
	private String pm;
	private int time;
	private String guestName;
	
	@Override
	public int compareTo(RepublicDay o) {
		System.out.println("this is comparble method");
		return 0;
	}
}


