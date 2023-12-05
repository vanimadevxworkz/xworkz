package com.xworkz.passportapplicationRunner;


import java.util.Date;

import com.xworkz.passportapplication.abstracts.PassportApplication;
import com.xworkz.passportapplication.abstractsimpl.HikePassport;
import com.xworkz.passportapplication.constant.Gender;
import com.xworkz.passportapplication.constant.PaymentOption;
import com.xworkz.passportapplication.dto.PassportApplicationDto;

public class PassportApplicationRunner {
	public static void main(String[] args) {
		
		 PassportApplicationDto  dto=new  PassportApplicationDto ();
		 
		 dto.setAge(25);
		 dto.setApplicationId(1);
		 dto.setContactNumber(6361400696l);
		 dto.setCurrentAddress("benglore");
		 dto.setDateOfBirth(new Date());
		 dto.setEmail("vanigon@dmail.com");
		 dto.setGender(Gender.FEMALE.toString());
		 dto.setOfficeLocation("benglore");
		 dto.setPaymentOption("atm");
		 dto.setPermanentAddress("bhatkal");
		 dto.setRegistrationDate(new Date());
		 dto.setUserName("vani");
		 
		
	     PassportApplicationDto  dto1=new  PassportApplicationDto ();
		 
		 dto1.setAge(26);
		 dto1.setApplicationId(2);
		 dto1.setContactNumber(6361400696l);
		 dto1.setCurrentAddress("mysore");
		 dto1.setDateOfBirth(new Date());
		 dto1.setEmail("vanigond@gmail.com");
		 dto1.setGender("female");
		 dto1.setOfficeLocation("beng");
		 dto1.setPaymentOption(PaymentOption.CREDITCARD.toString());
		 dto1.setPermanentAddress("Honnegadde");
		 dto1.setRegistrationDate(new Date());
		 dto1.setUserName("uma");
		 
		
		 PassportApplication pa=new HikePassport();
		 
		 System.out.println("on save method");
		 pa.onSave(dto);
		 pa.onSave(dto1);
		 
		 //read methods
		 System.out.println("read method");
		 pa.read();
		
		 //Search methods
		 System.out.println("search by current address");
		 pa.searchByCurrentAddress("benglore");
		 
		 System.out.println("search by contact number"); 
		 pa.searchByContactNumber(6361400696l);
		 
		 
		 //update methods
		System.out.println("update by application id");
		 dto.setApplicationId(1);
		 pa.updateByApplicationId(2, dto);
		 
		 System.out.println("update by email id");
		dto.setEmail("bhavyagond@gmail.com");
	    pa.updateByEmail("vanigond@gmail.com", dto);
	   
	   //delete methods
	    pa.deleteByApplicationId(1);
	    System.out.println("delete by id");
	    
	    		
	}
	

}
