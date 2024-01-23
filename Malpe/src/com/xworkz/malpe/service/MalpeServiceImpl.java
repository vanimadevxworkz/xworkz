package com.xworkz.malpe.service;

import java.util.List;

import com.xworkz.malpe.dto.MalpeDto;
import com.xworkz.malpe.repository.MalpeRepository;

public class MalpeServiceImpl implements MalpeService {
 
	private MalpeRepository repository;
	public MalpeServiceImpl(MalpeRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validate(MalpeDto malpeDto) {
		if(malpeDto!=null) {
			System.out.println("dto is not null");
			
			//check duplicate
			boolean exist=isExist(malpeDto);
			if(exist!=true) {
				
			//save method
			if(repository.onSave(malpeDto)) {
				System.out.println("dto saved successfully");
				return true;
			}else {
				System.out.println("not saved successfully");
				return false;
		
		}}else {
			System.out.println("dto is already exist");
		}
		}else {
		System.out.println("dto is  null");
	}
		return false;
	}
	@Override
	public void readAll() {
		List<MalpeDto> dtos=repository.readAll();
		System.out.println("read all:"+dtos);
		
	}
	@Override
	public boolean isExist(MalpeDto malpeDto) {
		List<MalpeDto> dto=repository.readAll();
		if(dto.contains(malpeDto)){
			return true;
		}
		//System.out.println(dtos);
		return false;
	
	}
	@Override
	public boolean update(String presidentName, MalpeDto malpeDto) {
		boolean update=repository.update(presidentName, malpeDto);
		if(update) {
			System.out.println("update successfully");
		}else {
			System.out.println("not update");
		}
		return false;
	}
	@Override
	public boolean delete(MalpeDto malpeDto) {
		boolean delete=repository.delete(malpeDto);
		if(delete) {
			System.out.println("delete successfully");
			return true;
		}else {
			System.out.println("not deleted");
		}
		return false;
	}
	

}
