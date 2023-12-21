package com.xworkz.jobportal.runner;

import com.xworkz.jobportal.repository.JobportalRepoImpl;
import com.xworkz.jobportal.repository.JobportalRepository;
import com.xworkz.jobportal.service.JobportalService;
import com.xworkz.jobportal.service.JobportalServiceImpl;

public class JobsportalRunner {
	
	public static void main(String[] args) {
		
		JobportalRepository repo=new JobportalRepoImpl();
		
		JobportalService service=new JobportalServiceImpl(repo);
		service.validate("linkedin");
		service.validate("naukari");
		service.validate("indeed");
		service.validate("apna");
	}

}
