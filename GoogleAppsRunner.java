package com.xworkz.googleApps.runner;

import com.xworkz.googleApps.dto.GoogleAppsDto;
import com.xworkz.googleApps.repository.GoogleAppsRepoImplementation;
import com.xworkz.googleApps.repository.GoogleAppsRepository;
import com.xworkz.googleApps.service.GoogleAppsService;
import com.xworkz.googleApps.service.GoogleAppsServiceImplementation;

public class GoogleAppsRunner {
	
	public static void main(String[] args) {
		
		GoogleAppsDto dto=new GoogleAppsDto();
		
		dto.setApplicationCost(0.0f);
        dto.setApplicationId("G001");
		dto.setApplicationVersion("x00v");
		dto.setAppName("drive");
		dto.setStorage(15);
		
		System.out.println("google apps dto:"+dto.toString());
		
		
		
		
		GoogleAppsRepository repo=new GoogleAppsRepoImplementation();
		//repo.onSave(dto);
		//repo.read();
		GoogleAppsService service=new GoogleAppsServiceImplementation(repo);
		service.validate(dto);
		//service.validate(dto);
		
	}

}
