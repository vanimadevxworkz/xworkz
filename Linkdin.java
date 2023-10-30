package com.xworkz.test.things;

public class Linkdin {
	private String founders;
	private String ceo;
	private String headquarters;
	private Company company;
	private JobSeeker jobSeeker;
	
	public Linkdin() {
		System.out.println("no args constructor");
	}

	public Linkdin(String founders, String ceo, String headquarters, Company company, JobSeeker jobSeeker) {
		System.out.println("all args constructor");
		this.founders = founders;
		this.ceo = ceo;
		this.headquarters = headquarters;
		this.company = company;
		this.jobSeeker = jobSeeker;
	}
	public void setFounders(String founders) {
		this.founders = founders;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	public String getFounders() {
		return founders;
	}
	public String getCeo() {
		return ceo;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public Company getCompany() {
		return company;
	}
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}
}
