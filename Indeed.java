package com.xworkz.test.things;

import java.util.Date;

public class Indeed {
	public String userName;
	public String password;
	public String emailId;
	public long contactNumber;
	public String address;
	public Date accountCreateDate;
	public String gender;
	
	 //constructor 1
	public Indeed() {
		this("pinki","fghd","fatgs@gamil.com",7688930l);
		System.out.println("this is indeed constructor");
	}
	 //constructor 2
	public Indeed(String userName) {
		this();
		System.out.println("this is indeed constructor");
		this.userName=userName;
		System.out.println("userName:"+this.userName);
	}
	 //constructor 3
	public Indeed(String userName,String password) {
		this();
		System.out.println("this is facebook constructor with 2-args");
		this.userName=userName;
		this.password=password;
		System.out.println("userName:"+this.userName+""+"password:"+this.password);
	}
	 //constructor 4
	public Indeed(String userName,String password, String emailId) {
		System.out.println("this is facebook constructor with 3-args");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId);
	}
	 //constructor 5
	public Indeed(String userName,String password,String emailId,long contactNumber) {
		System.out.println("this is instagrams constructro with 4-agrs");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		this.contactNumber=contactNumber;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
		"contactNumber:"+this.contactNumber);
	}
	 //constructor 6
	public Indeed(String userName,String password,String emailId,long contactNumber,String address) {
		System.out.println("this is instagrams constructro with 5-agrs");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		this.contactNumber=contactNumber;
		this.address=address;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
		"contactNumber:"+this.contactNumber+""+"address:"+this.address);
	}
	 //constructor 7
	public Indeed(String userName,String password,String emailId,long contactNumber,String address,Date accountCreateDate,String gender) {
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
