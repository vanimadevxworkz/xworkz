package com.xworkz.accountdetails.repositiory;

import com.xworkz.accountdetails.dto.AccountdetailsDto;

public class AccountDetailsRepoimpl extends AccountDetailsRepo {
     
	AccountdetailsDto[] dtos=new AccountdetailsDto[3];
	int index=0;
	@Override
	public boolean onSave(AccountdetailsDto accountdetailsDto) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i]!=null) {
			if(dtos[i].equals(accountdetailsDto)) {
				System.out.println("obj is present");
				return false;
			}
			}
		}
		if(index<dtos.length) {
			dtos[index]=accountdetailsDto;
			index++;
			System.out.println(index);
			System.out.println("dto is saved successfully");
			return true;
		}else {
			System.out.println("dto is not saved");
		return false;
	}
		}
	@Override
	public AccountdetailsDto[] read() {
		return dtos;
	}
	@Override
	public boolean updateByName(String name, AccountdetailsDto accountdetailsDto) {
		boolean result=false;
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i]!=null) {
				dtos[i]=accountdetailsDto;
				result=true;
					
				}
			}
		if(result==true) {
			return result;
		}
		return false;
	
	}
	
	

}
