package com.xworkz.pancard.service;

import com.xworkz.pancard.dto.PancardDto;

public interface PancardService {
	
	boolean validate(PancardDto pancardDto);
	
	boolean isExist(PancardDto pancardDto);
	

	boolean update(String email, PancardDto pancardDto1);
	
	void read();
	
	boolean delete(String email);
	

}
