package com.xworkz.googleApps.service;

import com.xworkz.googleApps.dto.GoogleAppsDto;
import com.xworkz.googleApps.repository.GoogleAppsRepository;

public class GoogleAppsServiceImplementation implements GoogleAppsService {
	
	private GoogleAppsRepository repository;
	
	public  GoogleAppsServiceImplementation(GoogleAppsRepository repository) {
	this.repository=repository;
	}
	
	boolean validateId=true;
	boolean validateCost=true;
	boolean validateName=true;
	boolean validateVersion=true;

	
	@Override
	public  boolean validate(GoogleAppsDto googleAppsDto) {
		System.out.println("google apps dto is ruuning");
		System.out.println("googledto is:"+ googleAppsDto);
		
		if(googleAppsDto==null) {
			System.out.println("dto is null");
			}else {
		
		
		
		if(googleAppsDto.getApplicationId().equals("null")
			    ||googleAppsDto.getApplicationId().equals(null)
			    ||(googleAppsDto.getApplicationId().length()<3
			    && googleAppsDto.getApplicationId().length()>10)
			   ||!googleAppsDto.getApplicationId().startsWith("G")) {
				
				System.out.println("id is null or check the length or start with G");
				validateId=false;
			}
		

			
		if(googleAppsDto.getApplicationCost()<0) {
		System.out.println("check the cost length");
			validateCost=false;
		}
		
		
	  if(googleAppsDto.getAppName().equals("null")
		  ||googleAppsDto.getAppName()==null){
			  System.out.println("name is equals to null or null");
			  validateName=false;
		  }
	  
	  if(googleAppsDto.getApplicationVersion().length()<3
			  &&googleAppsDto.getApplicationVersion().length()>10
			  ||(!googleAppsDto.getApplicationVersion().endsWith("v"))){
		  
		  System.out.println("check the length or ends with v");
		  validateVersion=false;
	  }
	  
		
			
				
	if(validateId&&validateCost&&validateName&&validateVersion) {
			System.out.println("validation is done");
		
			
		boolean exist=isExist(googleAppsDto);
		if(exist!=true) {
				
		boolean save=this.repository.onSave(googleAppsDto);
		if(save) {
		System.out.println("dto is saved successfully");
		return true;
		}else{
		System.out.println("not saved");
		return false;
	}}else {
		System.out.println("dto is exist");
	}
	}
			}

		return false;
	}
	

	@Override
	public boolean isExist(GoogleAppsDto googleAppsDto) {
		GoogleAppsDto[] appsDtos=this.repository.read();
		if(googleAppsDto!=null) {
			for(GoogleAppsDto dto:appsDtos) {
				if(dto!=null) {
					if(dto.equals(dto)) {
						return true;
			}
			}
		}
	}
		

		return false;
}
}
