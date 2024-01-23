package com.xworkz.consultancy.runner;

import java.util.List;

import com.xworkz.consultancy.dto.ConsultancyDto;
import com.xworkz.consultancy.repository.ConsultancyRepoImpl;
import com.xworkz.consultancy.repository.ConsultancyRepository;
import com.xworkz.consultancy.service.ConsultancyService;
import com.xworkz.consultancy.service.ConsultancyServiceImpl;

public class ConsultancyRunner {
public static void main(String[] args) {
	ConsultancyDto dtos=new ConsultancyDto("svs","akash",150,"bangaluru");
	System.out.println(dtos.toString());
	
	ConsultancyRepository repository=new ConsultancyRepoImpl();
	ConsultancyService service=new ConsultancyServiceImpl(repository);
	service.validateAndSave(dtos);
	// service.validateAndSave(dtos);
	service.readAll();

}
}
