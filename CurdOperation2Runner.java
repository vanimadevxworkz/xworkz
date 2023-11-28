
package com.xworkz.interview.driver;

import com.xworkz.interview.things.CurdOperation2;

public class CurdOperation2Runner {
	public static void main(String[] args) {
		
	
	
	CurdOperation2 cp2=new CurdOperation2();
	
	System.out.println("this is insert method");
	cp2.insert(50);
	cp2.insert(40);
	
	cp2.read();
	System.out.println("get read method");
	
	System.out.println("this is get update method");
	cp2.getUpdate(50, 45);
	cp2.read();
	
	System.out.println("this is get delete method");
	cp2.getDelete(45);
	cp2.read();
}
}