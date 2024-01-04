package com.xworkz.content.repository;

import com.xworkz.content.dto.ContentDto;


public interface ContentRepository {
	
	boolean onSave(ContentDto contentDto);
	
	ContentDto[] read();

	boolean update(String email, ContentDto contentDto);
	
	boolean delete(String email);
}
