package com.xworkz.test.things;

import java.util.Date;

public class Telegram {
	public String userName;
	public String password;
	public String emailId;
	public long contactNumber;
	public String address;
	public Date accountCreateDate;
	public String gender;
	
public Telegram() {
	this("madhu","123hu","vanimg@gail.com",1234567l);
	System.out.println("this is telegram constructor");
}
public Telegram(String userName) {
	this();
	System.out.println("this is telegram constructor with 1-1rgs");
	this.userName=userName;
	System.out.println("userName:"+this.userName);
}
public Telegram(String userName,String password) {
	this();
	System.out.println("this is facebook constructor with 2-args");
	this.userName=userName;
	this.password=password;
	System.out.println("userName:"+this.userName+""+"password:"+this.password);
}
public Telegram(String userName,String password, String emailId) {
	System.out.println("this is facebook constructor with 3-args");
	this.userName=userName;
	this.password=password;
	this.emailId=emailId;
	System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId);
}
public Telegram(String userName,String password,String emailId,long contactNumber) {
	System.out.println("this is instagrams constructro with 4-agrs");
	this.userName=userName;
	this.password=password;
	this.emailId=emailId;
	this.contactNumber=contactNumber;
	System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
	"contactNumber:"+this.contactNumber);
}
public Telegram(String userName,String password,String emailId,long contactNumber,String address) {
	System.out.println("this is instagrams constructro with 5-agrs");
	this.userName=userName;
	this.password=password;
	this.emailId=emailId;
	this.contactNumber=contactNumber;
	this.address=address;
	System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
	"contactNumber:"+this.contactNumber+""+"address:"+this.address);
}
public Telegram(String userName,String password,String emailId,long contactNumber,String address,Date accountCreateDate,String gender) {
	System.out.println("this is instagrams constructro with 7-agrs");
	this.userName=userName;
	this.password=password;
	this.emailId=emailId;
	this.contactNumber=contactNumber;
	this.address=address;
	this.accountCreateDate=accountCreateDate;
	this.gender=gender;
	System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
	"contactNumber:"+this.contactNumber+""+"address:"+this.address+""+"accountCreateDate:"+this.accountCreateDate+""+"gender:"+this.gender);
}


}
