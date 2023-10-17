package com.xworkz.test.things;

public class ContactNumbers {
	int index=0;
	int []contactList=new int[4];
	
	public void getNumbers(int numbers) {
		System.out.println("numbers are:"+numbers);
		if(index<contactList.length) {
			contactList[index]=numbers;
			index++;
		}else {
			System.out.println("contact is full....");
		}
	}
	 public void getTotalContact() {
		 for(int i=0;i<contactList.length;i++) {
			 System.out.println("total contactList are:"+contactList[i]);
		 }
	 }

}
