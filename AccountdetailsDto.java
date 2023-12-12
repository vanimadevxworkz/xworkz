package com.xworkz.accountdetails.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class AccountdetailsDto {
	
	private String name;
	private long accountNumber;
	private String email;
	private long contactNumber;
	private String address;
	private String branchCode;

}
