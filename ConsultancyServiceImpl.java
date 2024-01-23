package com.xworkz.consultancy.service;

import java.util.List;

import com.xworkz.consultancy.dto.ConsultancyDto;
import com.xworkz.consultancy.repository.ConsultancyRepository;

public class ConsultancyServiceImpl implements ConsultancyService{

	private ConsultancyRepository repository;
	public ConsultancyServiceImpl (ConsultancyRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(ConsultancyDto consultancyDto) {
		if(consultancyDto!=null) {
			System.out.println("dto is not null");
			
			boolean exist=isExist(consultancyDto);
			if(exist!=true) {
			if(repository.onSave(consultancyDto)) {
				System.out.println(" dto saved succesfully");
				return true;
			}else {
				System.out.println(" dto not saved");
			}}else {
				System.out.println("dto is already existed");
			}}else {
				System.out.println("dto is null");
		}
		return false;
	}
	@Override
	public void readAll() {
		List<ConsultancyDto> dto=repository.readAll();
		System.out.println("reading the dto:"+dto);
		
	}
	@Override
	public boolean isExist(ConsultancyDto consultancyDto) {
		List<ConsultancyDto> dto=repository.readAll();
		if(dto.contains(consultancyDto)) {
			return true;
		}
		return false;
	}

}
