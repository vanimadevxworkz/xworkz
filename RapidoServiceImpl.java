package com.xworkz.rapido.service;

import java.util.List;

import com.xworkz.rapido.dto.RapidoDto;
import com.xworkz.rapido.repository.RapidoRepository;

public class RapidoServiceImpl implements RapidoService {
  
	private RapidoRepository repository;
	public RapidoServiceImpl(RapidoRepository repository) {
		this.repository=repository;
	}
	@Override
	public boolean validate(RapidoDto rapidoDto) {
		if(rapidoDto!=null) {
		System.out.println("rapido dto is not null");
		
		//check the duplicate
		boolean exist=isExist(rapidoDto);
		if(exist!=true) {
			
		//onsave method
		if(repository.onSave(rapidoDto)) {
			System.out.println(" rapido dto is saved successfully");
		}else {
			System.out.println(" dto is not saved");
		}}else {
			System.out.println("rapido dto is already exist");
		}
		}
		return false;
	}
	@Override
	public void readAll() {
		List<RapidoDto> dtos=repository.readAll();
		System.out.println("read the dtos:"+dtos);
		
	}
	@Override
	public boolean isExist(RapidoDto rapidoDto) {
		List<RapidoDto> dtos=repository.readAll();
		if(dtos.contains(rapidoDto)) {
			return true;
		}
		return false;
	}

}
