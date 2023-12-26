package com.xworkz.festival.runner;

import com.xworkz.festival.repository.FestivalRepoImpl;
import com.xworkz.festival.repository.FestivalRepository;
import com.xworkz.festival.service.FestivalService;
import com.xworkz.festival.service.FestivalServiceImpl;

public class FestivalRunner {
	
	public static void main(String[] args) {
		FestivalRepository repo=new FestivalRepoImpl();
		
		
		FestivalService service=new FestivalServiceImpl(repo);
		service.validateAndSave("deepavali");
		service.validateAndSave("holi");
		service.validateAndSave("sankranti");
		service.validateAndSave("ganesh chaturti");
		service.validateAndSave("krishna janmastami");
		service.validateAndSave("dasra");
		service.validateAndSave("christmas");
		service.validateAndSave("rakshabandhan");
		service.validateAndSave("ram navami");
		service.validateAndSave("independence day");
		service.read();
		
		
		String oldName="christmas";
		String newName="republicDay";
		
		service.update(oldName,newName);
		service.read();
		
		service.delete("ram navami");
		service.read();
		
		
	}

}
