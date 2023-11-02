package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Empolyee;

public class CompanyRunner {
public static void main(String args[]) {
	Empolyee company=new Empolyee();
	company.setName("Google");
	company.setQualification("bsc");
	company.setSalary(25000);
	company.setPlace("benglore");
	
	String name=company.getName();
	System.out.println("company name is:"+name);
	
	String qualification=company.getQualification();
	System.out.println("qualification is:"+qualification);
	
	int salary=company.getSalary();
	System.out.println("salary is:"+salary);
	
	String place=company.getPlace();
	System.out.println("place is :"+place);
	
		
}
}
