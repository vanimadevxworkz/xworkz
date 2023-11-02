package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Accounts;

public class BankRunner {
	public static void main(String args[]) {
		Accounts bank=new Accounts();
		bank.setName("hdfc");
		bank.setTotalMembers(30);
		bank.setManeger("xxx");
		bank.setCeo("vvv");
		
		String name=bank.getName();
		System.out.println("name is:"+name);
		
		int totalMembers=bank.getTotalMembers();
		System.out.println("total members are:"+totalMembers);
		
		String maneger=bank.getManeger();
		System.out.println("maneger name is:"+maneger);
		
		String ceo=bank.getCeo();
		System.out.println("ceo name is:"+ceo);
	}

}
