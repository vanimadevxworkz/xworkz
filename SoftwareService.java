package com.xworkz.software.service;

public interface SoftwareService {
	
	boolean validateAndSave(String softwareName);
	
	boolean isExist(String softwareName);

}
