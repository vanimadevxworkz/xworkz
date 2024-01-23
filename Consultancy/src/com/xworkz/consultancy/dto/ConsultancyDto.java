package com.xworkz.consultancy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConsultancyDto {
	
 private String clinicName;
 private String doctorName;
 private int price;
 private String location;
}
