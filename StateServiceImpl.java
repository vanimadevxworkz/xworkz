package com.xworkz.state.service;

import com.xworkz.state.repository.StateRepository;

public class StateServiceImpl implements StateService {
	
private StateRepository repository;
	
	public StateServiceImpl(StateRepository repository) {
	
		this.repository=repository;
	}
	
	public boolean validate(String stateName) {
		if(stateName.isEmpty()
	 ||stateName.isBlank()
	 ||stateName.length()<3
	 ||stateName.length()>25
	 ||stateName==null) {
			System.out.println("give the correct place name");
		}else {
			
			//chack the duplicate values
			boolean exist=isExist(stateName);
			if(exist!=true) {
			
				
				//chaeck onSave methods
			boolean save=repository.onSave(stateName);
			if(save) {
				System.out.println("name is saved and validate successfully");
				return true;
			}else {
				System.out.println("not saved successfully");
				return false;
			}
				
			}else {
				System.out.println("exist sucessfully");
			}
		} 
			
				
		return false;
	}

	@Override
	public boolean isExist(String countryName) {
		String[] name=repository.read();
		if(name!=null) { 
			for(String names:name) {
				if(names!=null) {
				if(names.equals(countryName)) {
					return true;
			}
			}
			} 
		}
		return false;
	}


}
