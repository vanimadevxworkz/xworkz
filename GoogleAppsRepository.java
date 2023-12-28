package com.xworkz.googleApps.repository;

import com.xworkz.googleApps.dto.GoogleAppsDto;

public interface GoogleAppsRepository {
	
	boolean onSave(GoogleAppsDto googleAppsDto);
	
	GoogleAppsDto[] read();

}
