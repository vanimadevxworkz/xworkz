package com.xworkz.rapido.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.rapido.dto.RapidoDto;

public class RapidoRepoImpl implements RapidoRepository {

	List<RapidoDto> listOfDto=new ArrayList<RapidoDto>();
	
	@Override
	public boolean onSave(RapidoDto rapidoDto) {
		if(listOfDto!=null) {
			System.out.println("listOfDto is not null");
			listOfDto.add(rapidoDto);
			return true;
		}
		
		return false;
	}
	
	@Override
	public List<RapidoDto> readAll() {
		System.out.println("read all the rapido dtos");
		return listOfDto;
	}

}
