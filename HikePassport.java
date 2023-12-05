package com.xworkz.passportapplication.abstractsimpl;

import com.xworkz.passportapplication.abstracts.PassportApplication;
import com.xworkz.passportapplication.dto.PassportApplicationDto;


public class HikePassport extends PassportApplication {
	
    int index=0;
    Object obj[]=new Object[2];
	@Override
	public boolean onSave(PassportApplicationDto passportApplicationDto) {
		if(passportApplicationDto!=null) {
			System.out.println("dto is not null");
			if(index<obj.length) {
				obj[index]=passportApplicationDto;
				index++;
			}
		}else {
			System.out.println("dto is null");
		}
		return false;
	}
	@Override
	public void read() {
		for(Object object:obj) {
		System.out.println("read method object:"+object);
		
	}
	
	}
	@Override
	public void searchByCurrentAddress(String currentAddress) {
			System.out.println("search by current address:"+currentAddress);
			for(Object object:obj) {
				if(object.toString().contains(currentAddress)) {
				System.out.println("application is:"+object);		
				}
	}
	}
	
	public void searchByContactNumber(long contactNumber) {
		for(Object object:obj) {
			PassportApplicationDto dto=(PassportApplicationDto)object;
			if(dto.getContactNumber()==contactNumber) {
				System.out.println("search by contactNumber:"+dto.toString());
			}
			System.out.println("search by contact number:"+object);
		}
	}
	@Override
	public PassportApplicationDto updateByEmail(String email, PassportApplicationDto passportApplicationDto) {
			if(passportApplicationDto!=null) {
				for(Object object:obj) {
					 PassportApplicationDto  dto=(PassportApplicationDto)object;
					if(dto.getEmail()==email) {
						object=passportApplicationDto;
					}
					System.out.println("update by emil id:"+object);
				}
			}
			return passportApplicationDto;
	}
	
	public  PassportApplicationDto updateByApplicationId(int applicationId, PassportApplicationDto passportApplicationDto) {
	if( passportApplicationDto!=null ) {
		for(Object object:obj) {
			 PassportApplicationDto dto=( PassportApplicationDto)object;
			 if(dto.getApplicationId()==applicationId) {
				 object= passportApplicationDto ;
			 }
		
		System.out.println("update by application id:"+object);
		
	}}
	return null;
			

}
	@Override
	public void deleteByApplicationId(int applicationId) {
		for(Object object:obj) { 
			if(object!=null) {
			 PassportApplicationDto dto=( PassportApplicationDto)object;
			 if(dto.getApplicationId()==applicationId) {
				object=null;
			 }
			 System.out.println("delet by id:"+object);
				
			 }
		}
	
	}
}
