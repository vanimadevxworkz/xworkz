package com.xworkz.bar.service;

import com.xworkz.bar.dto.BarDto;

public interface BarService {
	
	boolean validate(BarDto barDto);
	
	void readAll();
	
	boolean isExist(BarDto barDto);

}
