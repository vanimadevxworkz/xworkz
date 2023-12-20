package com.xworkz.roadmap.service;

import com.xworkz.roadmap.repository.StreamRepository;

public class StreamSreviceImplementation implements StreamService {
	
	//association
	 private StreamRepository repository;
	 public StreamSreviceImplementation(StreamRepository repository) {
		 this.repository=repository;
		 
	 }

	@Override
	public boolean validateAndSave(String streamName) {
		if(streamName.isEmpty()
				||streamName.isBlank()
				||streamName.length()<3
				||streamName.length()>25
				||streamName==null) {
			System.out.println("give the correct stream name");
		}else {
			
			// on save method
			boolean save=repository.onSave(streamName);
			
			if(save) {
				System.out.println("Added stream successfully");
				return true;
			}else {
				System.out.println("not successfully");
			return false;
		}
		}
	
		return false;
}
}


