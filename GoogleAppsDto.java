package com.xworkz.googleApps.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class GoogleAppsDto {
	
	private String applicationId;
	private String applicationVersion;
	private int storage;
	private float applicationCost;
	private String appName;
	

}
