package com.xworkz.bar.service;

import java.util.List;

import com.xworkz.bar.dto.BarDto;
import com.xworkz.bar.repository.BarRepository;

public class BarServiceImpl implements BarService {

	private BarRepository repository;
	public BarServiceImpl(BarRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validate(BarDto barDto) {
		if(barDto!=null) {
			System.out.println("barDto is not null");
			
			boolean exist=isExist(barDto);
				if(exist!=true) {
			
			if(repository.onSave(barDto)) {
				System.out.println("dato is saved successfully");
				return true;
			}else {
				System.out.println("dto is not saved");
			}}else {
				System.out.println("dto is already exist");
			}}else {
				System.out.println("dto is null");
			
		}
		return false;
	}
	@Override
	public void readAll() {
		List<BarDto> dtos=repository.readAll();
		System.out.println("read the dtos:"+dtos);
	}
	@Override
	public boolean isExist(BarDto barDto) {
		List<BarDto> dtos=repository.readAll();
		if(dtos.contains(barDto)) {
			return true;
		}
		return false;
	}

}
