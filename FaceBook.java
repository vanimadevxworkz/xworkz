 package com.xworkz.test.things;

import java.util.Date;

public class FaceBook {
	public String userName;
	public String password;
	public String emailId;
	public long contactNumber;
	public String address;
	public Date accountCreateDate;
	public String gender;
	
	public FaceBook() {
		this("hita","hvbt","hitamg@gamil.com",988979037l);
		System.out.println("this is facwbook constuctor");
	}
	public FaceBook(String userName) {
		this();
		System.out.println("this is facebook constructor with 1-args");
		this.userName=userName;
		System.out.println("userName:"+this.userName);
		
	}
	public FaceBook(String userName,String password) {
		System.out.println("this is facebook constructor with 2-args");
		this.userName=userName;
		this.password=password;
		System.out.println("userName:"+this.userName+""+"password:"+this.password);
	}
	public FaceBook(String userName,String password, String emailId) {
		System.out.println("this is facebook constructor with 3-args");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId);
	}
	public FaceBook(String userName,String password,String emailId,long contactNumber) {
		System.out.println("this is instagrams constructro with 4-agrs");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		this.contactNumber=contactNumber;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
		"contactNumber:"+this.contactNumber);
	}
	public FaceBook(String userName,String password,String emailId,long contactNumber,String address) {
		System.out.println("this is instagrams constructro with 5-agrs");
		this.userName=userName;
		this.password=password;
		this.emailId=emailId;
		this.contactNumber=contactNumber;
		this.address=address;
		System.out.println("userName:"+this.userName+""+"password:"+this.password+""+"emailId:"+this.emailId+""+
		"contactNumber:"+this.contactNumber+""+"address:"+this.address);
	}
	public FaceBook(String userName,String password,String emailId,long contactNumber,String address,Date accountCreateDate,String gender) {
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
