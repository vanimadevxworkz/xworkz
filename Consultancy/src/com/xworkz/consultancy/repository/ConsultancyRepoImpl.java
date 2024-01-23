package com.xworkz.consultancy.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.consultancy.dto.ConsultancyDto;

public class ConsultancyRepoImpl implements ConsultancyRepository{

	List<ConsultancyDto> listofdto=new ArrayList<ConsultancyDto>();
	@Override
	public boolean onSave(ConsultancyDto consultancyDto) {
		if(listofdto!=null) {
			System.out.println("dto is not null");
			listofdto.add(consultancyDto);
			return true;
		}
		return false;
	}
	@Override
	public List<ConsultancyDto> readAll() {
		System.out.println("read all the dto");
		return listofdto;
	}

}
