package com.xworkz.accountdetails.repositiory;

import com.xworkz.accountdetails.dto.AccountdetailsDto;

public abstract class AccountDetailsRepo {
	
	public abstract boolean onSave(AccountdetailsDto accountdetailsDto);
	 
	public abstract AccountdetailsDto[] read();
	
	public abstract boolean updateByName(String name,AccountdetailsDto accountdetailsDto);
	
	

}
