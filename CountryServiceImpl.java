package com.xworkz.country.service;

import com.xworkz.country.repository.CountryRepository;

public class CountryServiceImpl implements CountryService {
	
	private CountryRepository repository;
	
	public CountryServiceImpl(CountryRepository repository) {
	
		this.repository=repository;
	}
	
	public boolean validate(String countryName) {
		if(countryName.isEmpty()
	 ||countryName.isBlank()
	 ||countryName.length()<3
	 ||countryName.length()>25
	 ||countryName==null) {
			System.out.println("give the correct place name");
		}else {
			
			//chack the duplicate values
			boolean exist=isExist(countryName);
			if(exist!=true) {
			
				
				//chaeck onSave methods
			boolean save=repository.onSave(countryName);
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

	