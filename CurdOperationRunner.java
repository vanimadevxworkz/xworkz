package com.xworkz.interview.driver;

import com.xworkz.interview.things.CurdOperation;

public class CurdOperationRunner {
	public static void main(String[] args) {
		
		CurdOperation cp=new CurdOperation();
		cp.onSave('l');
		cp.onSave('m');
		cp.onSave('s');
		
		System.out.println("this is on save method");
		
		cp.getRead();
		System.out.println("this is read method");
		
		cp.getUpdate('l', 'x');
		cp.getRead();
		System.out.println("this is update method");
		
		cp.getDelete('l');
		cp.getRead();
		System.out.println("this is delete method");
		
		
		
	}

}
