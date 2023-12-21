package com.xworkz.jobportal.repository;

public interface JobportalRepository {
	
	boolean onSave(String names);
	
	String[] read();

}
