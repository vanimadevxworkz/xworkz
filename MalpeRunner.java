package com.xwprkz.malpe.runner;

import com.xworkz.malpe.dto.MalpeDto;
import com.xworkz.malpe.repository.MalpeRepository;
import com.xworkz.malpe.repository.MalpeRepositoryImpl;
import com.xworkz.malpe.service.MalpeService;
import com.xworkz.malpe.service.MalpeServiceImpl;

public class MalpeRunner {
	public static void main(String[] args) {
		MalpeDto dto=new MalpeDto(1000,"Udupi","Richerd",15);
		System.out.println("dto is:"+dto.toString());
		
		MalpeRepository repo=new MalpeRepositoryImpl();
		
		MalpeService service=new MalpeServiceImpl(repo);
		service.validate(dto);
		//service.validate(dto);
		service.readAll();
		//service.isExist(dto);
		
	}

}
