package com.xworkz.test.driver;

import com.xworkz.test.things.ContactNumbers;

public class ContactNumbersRunner {
	public static void main(String args[]) {
		ContactNumbers contactNumbers=new ContactNumbers();
		contactNumbers.getNumbers(4);
		contactNumbers.getNumbers(5);
		contactNumbers.getNumbers(6);
		contactNumbers.getNumbers(7);
		
		contactNumbers.getTotalContact();
		
	}

}
