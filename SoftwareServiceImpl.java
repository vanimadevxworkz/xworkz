package com.xworkz.software.service;

import com.xworkz.software.repository.SoftwareRepository;

public class SoftwareServiceImpl implements SoftwareService{
      
	
	private SoftwareRepository repository;
	
	public SoftwareServiceImpl(SoftwareRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(String softwareName) {
		if(softwareName.isEmpty()
		||softwareName.isBlank()
		||softwareName.length()<2
	    ||softwareName.length()>30
	    ||softwareName==null
	    ) {
			System.out.println("to give correct name");
		}else {
			
			//to check the duplicate value
			
			boolean exist=isExist(softwareName);
			if(exist!=true) {
			
			
			boolean save=repository.onSave(softwareName);
			if(save) {
				System.out.println("name is saved and validate successfully");
				return true;
			}else {
				System.out.println("not saved successfully");
				return false;
			}
			}else {
				System.out.println("name is exist successfully");
			}
		}
	    
		return false;
	}
	@Override
	public boolean isExist(String softwareName) {
		String[]  name=repository.read();
		if(name!=null) {
			for(String names:name) {
				if(names!=null) {
					if(names.equals(softwareName)) {
						return true;
					}
				}
			}
			
		}
		return false;
	}
	
	

}
