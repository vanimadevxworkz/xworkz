package com.xworkz.test.things;

public class RD {
	private int rdNumber;
	private String startDate;
	private int periods;
	
	public RD() {
		System.out.println("no args constructor");
	}

	public RD(int rdNumber, String startDate, int periods) {
		System.out.println("all args constructor");
		this.rdNumber = rdNumber;
		this.startDate = startDate;
		this.periods = periods;
		
	}
	public void setRdNumber(int rdNumber) {
		this.rdNumber = rdNumber;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public int getRdNumber() {
		return rdNumber;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
public int getPeriods() {
		return periods;
	}
	
}
