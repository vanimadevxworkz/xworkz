package com.xworkz.test.things;

public class Online {
	private String appName;
	private int amount;
	private boolean payment;
	
	public Online() {
		System.out.println("no args constructor");
	}
	public Online(String appName, int amount, boolean payment) {
		System.out.println("all args constructor");
		this.appName = appName;
		this.amount = amount;
		this.payment = payment;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void isPayment(boolean payment) {
		this.payment=payment;
	}
	
	public String getAppName() {
		return appName;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public boolean isPayment() {
		return payment;
	}
	

}
