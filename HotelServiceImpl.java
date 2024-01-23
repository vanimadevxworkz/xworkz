package com.xworkz.hotel.service;

import java.util.List;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.repository.HotelRepository;

public class HotelServiceImpl implements HotelService {
 
	private HotelRepository repository;
	public HotelServiceImpl(HotelRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public boolean validate(HotelDto hotelDto) {
		if(hotelDto!=null) {
			System.out.println("hotel dto is not null");
			 
			boolean exist=isExist(hotelDto);
				if(exist!=true) {
			
			if(repository.onSave(hotelDto)) {
				System.out.println("dto is saved successfully");
			}else {
				System.out.println("dto is not savedsuccessfully");
			}}else {
				System.out.println("dto is already exist");
			}}else {
				System.out.println("dto is null");
			
		}
		return false;
	}

	@Override
	public void readAll() {
		List<HotelDto> dtos=repository.readAll();
		System.out.println("read the dto:"+dtos);
		
	}

	@Override
	public boolean isExist(HotelDto hotelDto) {
		List<HotelDto> dtos=repository.readAll();
		if(dtos.contains(hotelDto)) {
		return true;
		}
		return false;
		
	}

}
