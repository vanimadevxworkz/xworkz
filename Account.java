package com.xworkz.test.things;

public class Account {
	private String accountName;
	private long accountNumber;
	private String startDate;
	//private FD fd;
	//private RD rd;
	
	public Account() {
		System.out.println("no args constructor");
	}

	public Account(String accountName, long accountNumber, String startDate ) {
		System.out.println("all args constructor");
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.startDate = startDate;
		//this.fd=fd;
		//this.rd=rd;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/*public void setFD(FD fd) {
		this.fd = fd;
	}
	public void setRD(RD rd) {
		this.rd = rd;
	}*/
	

	public String getAccountName() {
		return accountName;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}	

	public String getStartDate() {
		return startDate;
	}	

	/*public FD getFD() {
		return fd;
	}
	public RD getRD() {
		return rd;
	}*/
	

}
