package com.xworkz.scam.things;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Scam {
	
	private String name;
	private String location;
	private boolean online;
	private int totalScams;
	private LocalDate date;
	
	

}
