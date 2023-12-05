package com.xworkz.passportapplication.abstracts;

import com.xworkz.passportapplication.dto.PassportApplicationDto;

public abstract class PassportApplication {
	
	public abstract boolean onSave(PassportApplicationDto passportApplicationDto);
	
	public abstract void read();
	
	public abstract void searchByCurrentAddress(String currentAddress);
	
	public abstract void searchByContactNumber(long contcatNumber);
	
	public abstract PassportApplicationDto updateByEmail(String email, PassportApplicationDto passportApplicationDto);
	
	public abstract  PassportApplicationDto updateByApplicationId(int applicationId, PassportApplicationDto  passportApplicationDto);
	
	public abstract  void deleteByApplicationId(int applicationId);

}
