package com.xworkz.company;

import com.xworkz.company.abstracts.OwnComapny;
import com.xworkz.company.dto.CompanyDto;
import com.xworkz.companyimpl.HikeCompany;

public class OwnComapnyRunner {
	public static void main(String[] args) {
		OwnComapny company=new HikeCompany();
		company.companyName();
		company.ceo();
		
		company.onSave(null);
		company.onSave(null);
		
		CompanyDto cd=new CompanyDto();
		cd.setName("google");
		cd.setSalary(25000);
		cd.setQualification("bsc");
		
		System.out.println(cd.getName());
		System.out.println(cd.getSalary());
		System.out.println(cd.getQualification());
		
		System.out.println("to string method:"+cd.toString());
		System.out.println("hash code method:"+cd.hashCode());
		System.out.println("equals method:"+cd.equals(company));
		
		
	}

}
