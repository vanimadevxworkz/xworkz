package com.xworkz.rapido.service;

import com.xworkz.rapido.dto.RapidoDto;

public interface RapidoService {
	
	boolean validate(RapidoDto rapidoDto);
	
	void readAll();
	
	boolean isExist(RapidoDto rapidoDto);

}
