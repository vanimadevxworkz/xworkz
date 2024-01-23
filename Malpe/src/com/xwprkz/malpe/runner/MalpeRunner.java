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
		
		service.readAll();
		
		//update method
	    String name="Richerd";
	
	    MalpeDto dto1=new MalpeDto(100,"malpe","vani",10);
	    dto1.setPresidentName("vani");
	
		service.update("Richerd", dto1);
		service.readAll();
		
		service.delete(dto1);
		service.readAll();
		
	}

}
