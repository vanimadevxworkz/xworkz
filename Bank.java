package com.xworkz.test.things;

public class Bank {
	private String name;
	private String founded;
	private String manger;
	private Online online;
	private Payment payment;
	private Account account;
	private FD fd;
	private RD rd;
	
	

	public Bank() {
		System.out.println("no args constructor");
	}

	public Bank(String name,String founded,String manger,Online online, Payment payment, Account account, FD fd, RD rd) {
		System.out.println("all args constructor");
		this.name=name;
		this.founded=founded;
		this.manger=manger;
		this.online = online;
		this.payment = payment;
		this.account = account;
		this.fd = fd;
		this.rd = rd;
	}
	public void setName(String name) {
	this.name=name;	
	}
	public void setFounded(String founded) {
		this.founded=founded;	
		}
	public void setManger(String manger) {
		this.manger=manger;	
		}
	public void setOnline(Online online) {
		this.online = online;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public void setFd(FD fd) {
		this.fd = fd;
	}
	public void setRd(RD rd) {
		this.rd = rd;
	}
	public String getName() {
		return name;
	}
	public String getFounded() {
		return founded;
	}
	public String getManger() {
		return manger;
	}

	public Online getOnline() {
		return online;
	}

	public Payment getPayment() {
		return payment;
	}

	public Account getAccount() {
		return account;
	}

	public FD getFd() {
		return fd;
	}

	public RD getRd() {
		return rd;
	}
}

