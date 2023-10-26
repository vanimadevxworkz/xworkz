package com.xworkz.test.driver;

import com.xworkz.test.things.ExamApplication;

public class ExamApplicationRunner {

	public static void main(String[] args) {
		 ExamApplication  examApplication=new  ExamApplication("vani",200,25,2011);
		 System.out.println(examApplication.studentName);
		 System.out.println(examApplication.examFees);
		 System.out.println(examApplication.numberOfApplication);
		 System.out.println(examApplication.registerNumber);
		 
		 //this type u can also declare
		// new ExamApplication("vani",200,25,2011);
	}
	

}
