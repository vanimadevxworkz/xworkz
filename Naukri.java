package com.xworkz.test.things;

public class Naukri {
	private String userName;
	private long contactNumber;
	private String userId;
	private Company company;
	private JobSeeker jobSeeker;
	 
	public Naukri() {
		System.out.println("no args constructor");
	}

	public Naukri(String userName, long contactNumber, String userId,Company company,JobSeeker jobSeeker) {
		System.out.println("all args constructor");
		this.userName = userName;
		this.contactNumber = contactNumber;
		this.userId = userId;
		this.company= company;
		this.jobSeeker=jobSeeker;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
    public String getUserName() {
		return userName;
	}
	public long getContactNumber() {
		return contactNumber;
	}	
	public String getUserId() {
		return userId;
	}

	public Company getCompany() {
		return company;
	}

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}	
}
