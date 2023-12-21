package com.xworkz.software.runner;

import com.xworkz.software.repository.SoftwareRepoImpl;
import com.xworkz.software.repository.SoftwareRepository;
import com.xworkz.software.service.SoftwareService;
import com.xworkz.software.service.SoftwareServiceImpl;

public class SoftwareRunner1 {
	
	public static void main(String[] args) {
		
		SoftwareRepository repo=new SoftwareRepoImpl();
		
		SoftwareService service=new SoftwareServiceImpl(repo);
		
		service.validateAndSave("Microsoft");
		service.validateAndSave("Google");
		service.validateAndSave("Microsoft windows");
		service.validateAndSave("Chrome");
		service.validateAndSave("android");
				
		  
	}
} 
