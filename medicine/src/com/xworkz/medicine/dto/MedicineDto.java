package com.xworkz.medicine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MedicineDto {
	
	private String name;
	private int price;
	private int numOfMedicine;

}
