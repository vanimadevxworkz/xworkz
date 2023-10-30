package com.xworkz.test.things;

public class FD {
	private String startDate;
	private int fdNumber;
	private int periods;
	
	public FD() {
		System.out.println("no args constructor");
	}

	public FD(String startDate, int fdNumber, int periods) {
		System.out.println("all args constructor");
		this.startDate = startDate;
		this.fdNumber = fdNumber;
		this.periods = periods;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setFdNumber(int fdNumber) {
		this.fdNumber = fdNumber;
	}
	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public String getStartDate() {
		return startDate;
	}
	
	public int getFdNumber() {
		return fdNumber;
	}

	
	public int getPeriods() {
		return periods;
	}

}
