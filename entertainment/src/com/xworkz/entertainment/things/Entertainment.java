package com.xworkz.entertainment.things;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Entertainment  {
  
	
	private String eventName;
	private String location;
	private String guest;
	private int numOfPeople;
	private LocalDate date;
	
}
