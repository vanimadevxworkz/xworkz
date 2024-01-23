package com.xworkz.malpe.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.malpe.dto.MalpeDto;

public class MalpeRepositoryImpl implements MalpeRepository {
 
	
	List<MalpeDto> listOfMalpeDto=new ArrayList<MalpeDto>();
	
	@Override
	public boolean onSave(MalpeDto malpeDto) {
		if(listOfMalpeDto!=null) {
			System.out.println("dto is not null");
			listOfMalpeDto.add(malpeDto);
			return true;
			
		}
		return false;
	}
	@Override
	public List<MalpeDto> readAll() {
		System.out.println("reading all dto");
		return listOfMalpeDto;
	}
	@Override
	public boolean update(String presidentName, MalpeDto malpeDto) {
		for(MalpeDto dto:listOfMalpeDto) {
			System.out.println(dto);
			if(dto.getPresidentName().equalsIgnoreCase(presidentName)) {
				dto.setPresidentName(malpeDto.getPresidentName());
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean delete(MalpeDto malpeDto) {
		for(MalpeDto dto:listOfMalpeDto) {
			System.out.println(dto);
			if(dto.getPresidentName().equals(malpeDto)) {
				//dto.setPresidentName(malpeDto.getPresidentName());
				listOfMalpeDto.remove(malpeDto);
				return true;
			}
		}
		return false;
	}
	

}
