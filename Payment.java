package com.xworkz.test.things;

public class Payment {
	private String paymentMode;
	private boolean payment;
	private int payAmount;
	//private Online online;
	
	public Payment() {
		System.out.println("no args constructor");
	}

	public Payment(String paymentMode, boolean payment, int payAmount) {
		super();
		this.paymentMode = paymentMode;
		this.payment = payment;
		this.payAmount = payAmount;
		//this.online = online;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public void setPayment(boolean payment) {
		this.payment = payment;
	}	
	
	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}
	/*public void setOnline(Online online) {
		this.online = online;
	}*/
	public String getPaymentMode() {
		return paymentMode;
	}
	public boolean isPayment() {
		return payment;
	}	

	public int getPayAmount() {
		return payAmount;
	}

	/*public Online getOnline() {
		return online;*/
	}

	
	
	


