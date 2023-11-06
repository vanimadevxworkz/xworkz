package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Shops;

public class CustomerRunner {
	public static void main(String args[]) {
		Shops customer=new Shops();
		customer.name="abcd";
		customer.contactNumber=123456789l;
		customer.customerId="trfjr25376";
		
		System.out.println("customer name is:"+customer.name);
		System.out.println("customer contactnumber:"+customer.contactNumber);
		System.out.println("customer id:"+customer.customerId);
		
		
	}

}
