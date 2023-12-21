package com.xworkz.jobportal.service;

import com.xworkz.jobportal.repository.JobportalRepository;

public class JobportalServiceImpl implements JobportalService {
	
	
	private JobportalRepository repository;
	 public JobportalServiceImpl(JobportalRepository repository) {
		 this.repository=repository;
	 }

	@Override
	public boolean validate(String names) {
		if(names.isEmpty()
		||names.isBlank()
	  ||names.length()<2
	  ||names.length()>30
	  ||names==null) {
			
			System.out.println("to give the correct name");
		}else {
			
			boolean exist=isExist(names);
			if(exist!=true) {
		
		
		boolean  save=repository.onSave(names);
		if(save) {
			System.out.println("name is saved successfully");
			return true;
		}else {
			System.out.println("not saved successfully");
			return false;
		}
		}else {
			System.out.println("app is exist sucessfully");
			return true;
		}
		}
		return false;
	}
		

	@Override
	public boolean isExist(String names) {
		String[] app=repository.read();
		if(app!=null) {
			for(String name:app) {
				if(name!=null) {
					if(name.equals(names)) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
