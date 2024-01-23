package com.xworkz.malpe.repository;

import java.util.List;

import com.xworkz.malpe.dto.MalpeDto;

public interface MalpeRepository {
	
	boolean onSave(MalpeDto malpeDto);
	
	List<MalpeDto> readAll();

}
