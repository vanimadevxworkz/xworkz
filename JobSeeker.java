package com.xworkz.test.things;

public class JobSeeker {
	private String employeeName;
	private int salary;
	private String name;
	private String postName;
	private String manger;
	private Education education;
	
	public JobSeeker() {
		System.out.println("no args constructor");
	}
	
	public JobSeeker(String employeeName, int salary, String name, String postName, String manger,
			Education education) {
		System.out.println("all args constructor");
		this.employeeName = employeeName;
		this.salary = salary;
		this.name = name;
		this.postName = postName;
		this.manger = manger;
		this.education = education;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public void setManger(String manger) {
		this.manger = manger;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getSalary() {
		return salary;
	}	
	public String getName() {
		return name;
	}

	public String getPostName() {
		return postName;
	}

	public String getManger() {
		return manger;
	}

	public Education getEducation() {
		return education;
	}
	
}
