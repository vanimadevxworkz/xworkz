package com.xworkz.company;

import com.xworkz.company.abstracts.OwnComapny;
import com.xworkz.companyimpl.HikeCompany;

public class OwnComapnyRunner {
	public static void main(String[] args) {
		OwnComapny company=new HikeCompany();
		company.companyName();
		company.ceo();
	}

}
