package com.xworkz.content.service;

import com.xworkz.content.dto.ContentDto;

public interface ContentService {
	
boolean validate(ContentDto contentDto );
	
	boolean isExist(ContentDto contentDto);
	

	boolean update(String email, ContentDto contentDto);
	
	void read();
	boolean validateDelete(String email);
	

}
