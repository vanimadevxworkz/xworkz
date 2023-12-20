package com.xworkz.roadmap.runner;

import com.xworkz.roadmap.repository.StreamRepository;
import com.xworkz.roadmap.repository.StreamRepositoryImplementation;
import com.xworkz.roadmap.service.StreamService;
import com.xworkz.roadmap.service.StreamSreviceImplementation;

public class StreamRunner {
	
	public static void main(String[] args) {
		
		StreamRepository repo=new StreamRepositoryImplementation();
		
		//repo.onSave("civil");
		
		
		StreamService service=new StreamSreviceImplementation(repo);
		service.validateAndSave("civil");
		service.validateAndSave("mechanical");			
	}
}
