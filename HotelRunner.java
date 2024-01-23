package com.xworkz.hotel.runner;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.repository.HotelRepository;
import com.xworkz.hotel.repository.HotelRepositoryImpl;
import com.xworkz.hotel.service.HotelService;
import com.xworkz.hotel.service.HotelServiceImpl;

public class HotelRunner {
	
	public static void main(String[] args) {
		HotelDto dto=new HotelDto("Swadist", 30, "biriyani", 25);
		System.out.println("dto is:"+dto.toString());
		
		HotelRepository repo=new HotelRepositoryImpl();
		
		HotelService service=new HotelServiceImpl(repo);
		service.validate(dto);
		service.readAll();
	}

}
