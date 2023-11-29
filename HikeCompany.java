package com.xworkz.companyimpl;

import com.xworkz.company.abstracts.OwnComapny;
import com.xworkz.company.dto.CompanyDto;


public class HikeCompany extends OwnComapny {

	@Override
	public void companyName() {
		System.out.println("this is own company method");
	}

	@Override
	public void ceo() {
	System.out.println("ceo of the company");
	}
	
	 Object obj[]=new Object[2];
	    int index=0;
		@Override
		public boolean onSave(CompanyDto companyDto) {
			if(companyDto!=null) {
				System.out.println("dto is not null");
				if(index<obj.length) {
				obj[index]=companyDto;
				index++;
				}
			}else {
				System.out.println("dto is   null");
			}
			return false;
		}
	

}
