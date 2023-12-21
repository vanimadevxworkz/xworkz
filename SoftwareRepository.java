package com.xworkz.software.repository;

public interface SoftwareRepository {
	
	boolean onSave(String softwareName);
	
	String[] read();

}
