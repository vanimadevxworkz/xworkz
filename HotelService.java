package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDto;

public interface HotelService {
	
	boolean validate(HotelDto hotelDto);
	
	void readAll();
	
	boolean isExist(HotelDto hotelDto);

}
