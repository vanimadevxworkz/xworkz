package com.xworkz.palindrom.things;

public class Palindrom {
	public static void main(String[] args) {
		
	
	int originalNumber=13531;
	int revNum=0; 
	int temp=13531;//originalNumber
	
	while(temp>0) {
		int rem=temp%10;
		System.out.println("remander is:"+rem);
		
		revNum=(revNum*10)+rem;
		System.out.println("rev number is:"+revNum);
		
		temp=temp/10;
		System.out.println("temp number is:"+temp);
	}
	if(originalNumber==revNum) {
	System.out.println("it is a palindrom number");
	
	}else {
		System.out.println("it is not a palindrom");

}
}
}