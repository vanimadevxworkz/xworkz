package com.xworkz.googleApps.service;

import com.xworkz.googleApps.dto.GoogleAppsDto;

public interface GoogleAppsService {
	
	 boolean validate(GoogleAppsDto googleAppsDto);
	 
	 boolean isExist(GoogleAppsDto googleAppsDto);

}
