package com.xworkz.bar.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bar.dto.BarDto;

public class BarRepositoryImpl implements BarRepository {

	List<BarDto> listOfDto=new ArrayList<BarDto>();
	
	@Override
	public boolean onSave(BarDto barDto) {
		if(listOfDto!=null) {
			System.out.println("listOfDto is not null");
			listOfDto.add(barDto);
			return true;
		}else {
			System.out.println("listOfDto is null");
		}
		return false;
	}
	
	@Override
	public List<BarDto> readAll() {
		System.out.println("read all the dtos");
		return listOfDto;
	}

}
