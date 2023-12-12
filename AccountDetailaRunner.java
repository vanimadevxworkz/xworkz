package com.xworkz.accountdetails.runner;

import com.xworkz.accountdetails.dto.AccountdetailsDto;
import com.xworkz.accountdetails.service.AccountDetailsService;
import com.xworkz.accountdetails.service.AccountDetailsServiceimpl;

public class AccountDetailaRunner {
	
	public static void main(String[] args) {
		
		AccountdetailsDto  ac=new AccountdetailsDto("vani",1234567789l,"vani@gmail.com",457382893l,"bhatkal","CANB201");
		
		AccountdetailsDto  ac1=new AccountdetailsDto("uma",346732892l,"uma@gmail.com",6361400696l,"bhatkal","CANB202");
		
		AccountdetailsDto  ac2=new AccountdetailsDto("anii",1234567789l,"gv@gmail.com",457382893l,"bhatkal","CANB203");
		
		AccountDetailsService ads=new AccountDetailsServiceimpl();
		ads.validateDto(ac2);
		ads.validateDto(ac);
		ads.validateDto(ac1);
		
		System.out.println("read object");
		ads.read();
		
		
		System.out.println("disply");
		AccountdetailsDto  ac3=new AccountdetailsDto("giri",1234567789l,"vani@gmail.com",457382893l,"bhatkal","CANB201");
		ads.update("vani", ac3);
		ads.read();
	}
		
	}
