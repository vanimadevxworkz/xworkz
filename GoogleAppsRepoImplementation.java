package com.xworkz.googleApps.repository;

import com.xworkz.googleApps.dto.GoogleAppsDto;

public class GoogleAppsRepoImplementation implements GoogleAppsRepository {

	
	   private GoogleAppsDto[] appsDtos=new GoogleAppsDto[5];
	   
	   int index=0;
	@Override
	public boolean onSave(GoogleAppsDto googleAppsDto) {
		if(index<this.appsDtos.length) {
			appsDtos[this.index]=googleAppsDto;
			this.index++;
			return true;
		}
		return false;
		
	}
	@Override
	public GoogleAppsDto[] read() {
		System.out.println("reading dtos............");
		return appsDtos;
	}
	
	

	

}
