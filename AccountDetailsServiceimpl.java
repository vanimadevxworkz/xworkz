package com.xworkz.accountdetails.service;

import com.xworkz.accountdetails.dto.AccountdetailsDto;
import com.xworkz.accountdetails.repositiory.AccountDetailsRepo;
import com.xworkz.accountdetails.repositiory.AccountDetailsRepoimpl;

public class AccountDetailsServiceimpl extends  AccountDetailsService{
      
	AccountDetailsRepo repo=new AccountDetailsRepoimpl();
	@Override
	public boolean validateDto(AccountdetailsDto accountdetailsDto) {
		if( accountdetailsDto!=null) {
			boolean isName=validateName( accountdetailsDto.getName());
			boolean isEmail=validateEmail(accountdetailsDto.getEmail());
			boolean isAddress=validateAddress(accountdetailsDto.getAddress());
			boolean isBranchCode=validateBranchCode(accountdetailsDto.getBranchCode());
			
			repo.onSave(accountdetailsDto);
			
		}
		return false;
	}
	
	
private boolean validateName( String name) {
	if(name.isEmpty()) {
  System.out.println("it is empty");
		return false;
	}
	
	if(name.isBlank()) {
	return false;
	}
	return true;
}


private boolean validateEmail(String email) {
	if(email.isEmpty()) {
  System.out.println("it is empty");
		return false;
	}
	
	if(email.isBlank()) {
	
	return false;
	}
	return true;

}
private boolean validateAddress(String address) {
	if(address.isEmpty()) {
  System.out.println("it is empty");
		return false;
	}
	
	if(address.isBlank()) {
	
	return false;
	}
	return true;

}
private boolean validateBranchCode(String branchCode) {
	if(branchCode.isEmpty()) {
  System.out.println("it is empty");
		return false;
	}
	
	if(branchCode.isBlank()) {
	
	return false;
	}
	return true;
}

public void read() {
	AccountdetailsDto[] dto=repo.read();
	for(AccountdetailsDto accountdetailsDto:dto) {
		System.out.println(accountdetailsDto);
	}
}


public boolean update(String name, AccountdetailsDto accountdetailsDto) {
	boolean result=repo.updateByName(name, accountdetailsDto);
	if(result==true) {
		System.out.println("update");
	}

else {
	System.out.println("not update");
		
	}
	return result;

}
}






