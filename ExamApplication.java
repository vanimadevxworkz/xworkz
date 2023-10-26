package com.xworkz.test.things;

public class ExamApplication {
	public String studentName;
	public int examFees;
	public int numberOfApplication;
	public int registerNumber;
	
	public ExamApplication() {
		System.out.println("this is default comstructore");
		}
	public ExamApplication( String studentName,int examFees,int numberOfApplication,int registerNmuber) {
		System.out.println("this is parameterized constructor");
		this.studentName=studentName;
		this.examFees=examFees;
		this.numberOfApplication=numberOfApplication;
		this.registerNumber=registerNumber;
		
		//direct this type also initialise
		/*System.out.println(this.studentName);
		System.out.println(this.examFees);
		System.out.println(this.numberOfApplication);
		System.out.println(this.registerNumber);*/
		
	}
	
	

}
