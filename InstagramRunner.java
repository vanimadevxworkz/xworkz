package com.xworkz.test.driver;
import  com.xworkz.test.things.Instagram;

public class InstagramRunner {
	public static void main(String args[]) {
		Instagram instagram=new Instagram();
		instagram.userName="VaniGond";
		instagram.password="giri";
		instagram. profileSet=true;
		instagram.phoneNumber=6361400696l;
		instagram.emailId="vanimg09@gmail.com";
		instagram.dateOfBirth=20-10-1996;
		instagram.location="benglore";
		instagram.gender="female";
		instagram.age=21;
		instagram.accountType="personal";
		
		System.out.println(instagram.userName);
		System.out.println(instagram.password);
		System.out.println(instagram.profileSet);
		System.out.println(instagram.phoneNumber);
		System.out.println(instagram.emailId);
		System.out.println(instagram.dateOfBirth);
		System.out.println(instagram.location);
		System.out.println(instagram.gender);
		System.out.println(instagram.age);
		System.out.println(instagram.accountType);
		if(instagram.location=="benglore") {
			System.out.println("location is a benglore");
		}else {
			System.out.println("location is not a benglore");
		}
			if(instagram.profileSet==true) {
				System.out.println("isprofile is true");
			}else {
				System.out.println("isprofileset is not true");
				
			}
				if(instagram.password==null) {
				System.out.println("password is null");
				}else {
					System.out.println("password is not null");
				}
		
		
	}
}
