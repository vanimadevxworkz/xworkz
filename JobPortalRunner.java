package com.xworkz.test.driver;

import com.xworkz.test.things.Company;
import com.xworkz.test.things.Education;
import com.xworkz.test.things.JobPortal;
import com.xworkz.test.things.JobSeeker;
import com.xworkz.test.things.Naukri;
import com.xworkz.test.things.Linkdin;

public class JobPortalRunner {
	public static void main(String args[]) {
		
		Education education=new Education();
		education.setCollegeName("ppc");
		education.setFees(22000);
		education.setQualification("bsc");
		education.setUnivarsity("manglore");
		education.setPincode(2344);
		
		Company company=new Company();
		company.setCompanyName("google");
		company.setJobPost("HR");
		company.setVacancy(7);
		company.setWorkmode("online");
		company.setEducation(education);
		
		JobSeeker jobSeeker=new JobSeeker();
		jobSeeker.setEmployeeName("vani");
		jobSeeker.setSalary(25000);
		jobSeeker.setManger("xxx");
		jobSeeker.setName("yyy");
		jobSeeker.setPostName("zzz");
		jobSeeker.setEducation(education);
		
		Naukri naukri=new Naukri();
		naukri.setUserName("qqq");
		naukri.setUserId("priya");
		naukri.setContactNumber(8792036739l);
		naukri.setCompany(company);
		naukri.setJobSeeker(jobSeeker);
		
		Linkdin linkdin=new Linkdin();
		linkdin.setCeo("ryan rosalnsky");
		linkdin.setFounders("reid hoffman");
		linkdin.setHeadquarters("california");
		linkdin.setCompany(company);
		linkdin.setJobSeeker(jobSeeker);
		
		JobPortal jobPortal=new JobPortal();
		jobPortal.setPoratlName("naukri");
		jobPortal.setTotalJobPortal(10);
		jobPortal.setJobPlace("benglore");
		jobPortal.setNaukri(naukri);
	jobPortal.setLinkdin(linkdin);
		
		
		System.out.println(jobPortal.getNaukri().getCompany().getEducation().getCollegeName());
		System.out.println(jobPortal.getNaukri().getCompany().getEducation().getFees());
		System.out.println(jobPortal.getNaukri().getCompany().getEducation().getQualification());
		System.out.println(jobPortal.getNaukri().getCompany().getEducation().getUnivarsity());
		System.out.println(jobPortal.getNaukri().getCompany().getEducation().getPincode());
		
		System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getCollegeName());
		System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getFees());
		System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getQualification());
		System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getUnivarsity());
		System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getPincode());
		
	}

}
