package com.xworkz.test.things;

public class Gmail {
	public String userId;
	public String password;
	public int memory;
	public int numberOfMessage;
	public int numberOfContacts;
	
	public Gmail() {
		this.sendMessage();
		System.out.println("this is no arguments method");	
		}
	
	public Gmail(String userId, String password,int memory,int numberOfMessage,int numberOfContacts) {
		this.userId=userId;
		this.password=password;
		this.memory=memory;
		this.numberOfMessage=numberOfMessage;
		this.numberOfContacts=numberOfContacts;
		
	}
	public void getMessage() {
		System.out.println("this is get message method from gmail");
	}
	public void sendMessage() {
		System.out.println("this send message method from gmail");
	}
	public void getContactNumbers(int...contactNumbers) { 
		System.out.println("contactNumber of gmail contact:"+contactNumbers.length);
		for(int i=0;i<contactNumbers.length;i++) {
			System.out.println(contactNumbers[i]);
		}}
		public void getContactName(String...contactName) {
			System.out.println("contact name are:"+contactName.length );
			for(int i=0;i<contactName.length;i++) {
				System.out.println(contactName[i]);
			}
		}
	}
	
	
	
