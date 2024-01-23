package com.xworkz.rapido.runner;

import com.xworkz.rapido.dto.RapidoDto;
import com.xworkz.rapido.repository.RapidoRepoImpl;
import com.xworkz.rapido.repository.RapidoRepository;
import com.xworkz.rapido.service.RapidoService;
import com.xworkz.rapido.service.RapidoServiceImpl;

public class RapidoRunner {

	public static void main(String[] args) {
		RapidoDto dto=new RapidoDto("Aravind Sanka", "KA19M4819", "kreta", "nagaraj");
		System.out.println("dto is:"+dto.toString());
		
		RapidoDto dto1=new RapidoDto("Aravind Sanka", "KA19M4819", "kreta", "nagaraj");
		System.out.println("dto is:"+dto1.toString());
		
		RapidoRepository repo=new RapidoRepoImpl();
		
		RapidoService service=new RapidoServiceImpl(repo);
		service.validate(dto);
		service.validate(dto1);
		service.readAll();
	}
}
