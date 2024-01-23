package com.xworkz.hotel.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hotel.dto.HotelDto;

public class HotelRepositoryImpl implements HotelRepository {

	List<HotelDto> listOfDto=new ArrayList<HotelDto>();
	
	@Override
	public boolean onSave(HotelDto hotelDto) {
		if(listOfDto!=null) {
			System.out.println("listOfDto is not null");
			listOfDto.add(hotelDto);
			return true;
		}else {
			System.out.println("listOfDto is null");
		}
		return false;
	}
	
	@Override
	public List<HotelDto> readAll() {
		System.out.println("read all the dtos");
		return listOfDto;
	}

}
