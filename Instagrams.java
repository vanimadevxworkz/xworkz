package com.xworkz.test.things;
import  java.util.Date;

public class Instagrams {
	public String userName;
	public String password;
	public String emailId;
	public long contactNumber;
	public String address;
	public Date accountCreateDate;
	public String gender;
	
	public Instagrams() {
		this("vani","girish","vanimg",657489392l);
		System.out.println("this is Instagrams constructor");
	}
	
	public Instagrams(String userName) {
		this();
		System.out.println("this is instagrams constructro with 1-agrs");
		this.userName=userName;
		System.out.println("userName:"+this.userName);
	}
	public Instagrams(String userName,String password) {
		//this("vani","giri","vanimg");
		System.out.println("this is instagrams constructro with 2-agrs");
		this.userName=userName;
		this.password=password;
		System.out.println("userName:"+this.userName+""+"password:"+this.password);
	}
	public Instagrams(String userName,String password,String emailId) {
		//this("vani","giri","vanimg",65748392l);
		System.out.println("this is instagrams constructro with 3-agrs");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId);
	}
	public Instagrams(String userName,String password,String emailId,long contactNumber) {
		System.out.println("this is instagrams constructro with 4-agrs");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		this.contactNumber=contactNumber;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
		"contactNumber:"+this.contactNumber);
	}
	public Instagrams(String userName,String password,String emailId,long contactNumber,String address) {
		System.out.println("this is instagrams constructro with 5-agrs");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		this.contactNumber=contactNumber;
		this.address=address;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
		"contactNumber:"+this.contactNumber+""+"address:"+this.address);
	}
	public Instagrams(String userName,String password,String emailId,long contactNumber,String address,Date accountCreateDate,String gender) {
		System.out.println("this is instagrams constructro with 7-agrs");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		this.contactNumber=contactNumber;
		this.address=address;
		this.accountCreateDate=accountCreateDate;
		this.gender=gender;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
		"contactNumber:"+this.contactNumber+""+"address:"+this.address+""+"accountCreateDate:"+this.accountCreateDate+""+
				"gender:"+this.gender);
	}
}