package com.xworkz.test.things;

public class Company {
	private String companyName;
	private String jobPost;
	private int vacancy;
	private String workmode;
	private Education education;
	 
	public Company() {
		System.out.println("no args constructor");
	}

	public Company(String companyName, String jobPost, int vacancy, String workmode,Education education) {
		System.out.println("all args constructor");
		this.companyName = companyName;
		this.jobPost = jobPost;
		this.vacancy = vacancy;
		this.workmode = workmode;
		this.education=education;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setJobPost(String jobPost) {
		this.jobPost = jobPost;
	}

	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	public void setWorkmode(String workmode) {
		this.workmode = workmode;
	}
	public void setEducation(Education education) {
		this.education=education;
	}

	public String getCompanyName() {
		return companyName;
	}
	
	public String getJobPost() {
		return jobPost;
	}
	
	public int getVacancy() {
		return vacancy;
	}

	public String getWorkmode() {
		return workmode;
	}
	public Education getEducation(){
		return education;
	}
	
}
