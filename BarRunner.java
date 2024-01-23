package com.xworkz.bar.runner;

import com.xworkz.bar.dto.BarDto;
import com.xworkz.bar.repository.BarRepository;
import com.xworkz.bar.repository.BarRepositoryImpl;
import com.xworkz.bar.service.BarService;
import com.xworkz.bar.service.BarServiceImpl;

public class BarRunner {
	
	public static void main(String[] args) {
		BarDto dto=new BarDto("four-season", 1000, "Oldmonk", "orange");
		System.out.println("dto is:"+dto.toString());
		
		BarRepository repo=new BarRepositoryImpl();
		
		BarService service=new BarServiceImpl(repo);
		service.validate(dto);
		service.readAll();
		
	}

}
