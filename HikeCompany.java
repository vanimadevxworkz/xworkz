package com.xworkz.companyimpl;

import com.xworkz.company.abstracts.OwnComapny;

public class HikeCompany extends OwnComapny {

	@Override
	public void companyName() {
		System.out.println("this is own company method");
	}

	@Override
	public void ceo() {
	System.out.println("ceo of the company");
	}

}
