package com.xworkz.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventDto {
	
	private String EventName;
	private String guest;
	private int date;

}
