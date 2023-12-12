package com.xworkz.accountdetails.service;

import com.xworkz.accountdetails.dto.AccountdetailsDto;

public abstract class AccountDetailsService {
	
	public abstract boolean validateDto(AccountdetailsDto accountdetailsDto );
	
	public abstract void read();
	
	public abstract boolean update(String name,AccountdetailsDto accountdetailsDto);

}
