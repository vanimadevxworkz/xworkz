package com.xworkz.test.things;

public class Education {
	private String qualification;
	private String univarsity;
	private int fees;
	private String collegeName;
	private int pincode;
	
	public Education() {
		System.out.println("no args constructor");
		}

	public Education(String qualification, String univarsity, int fees, String collegeName, int pincode) {
		System.out.println("all args constructor");
		this.qualification = qualification;
		this.univarsity = univarsity;
		this.fees = fees;
		this.collegeName = collegeName;
		this.pincode = pincode;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setUnivarsity(String univarsity) {
		this.univarsity = univarsity;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	public String getQualification() {
		return qualification;
	}	

	public String getUnivarsity() {
		return univarsity;
	}

	public int getFees() {
		return fees;
	}

	public String getCollegeName() {
		return collegeName;
	}
	public int getPincode() {
		return pincode;
	}
	
}
