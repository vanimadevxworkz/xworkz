package com.xworkz.state.repository;

public interface StateRepository {

boolean onSave(String stateName);
	
	String[] read();

}
