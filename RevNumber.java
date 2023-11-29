package com.xworkz.palindrom.things;

public class RevNumber {
	public static void main(String[] args) {
		
		int number=987654;
		int reverse=0;
		//int temp=number;
		
		for(;number!=0;) {
			int rem=number%10;
			reverse=reverse*10+rem;
			number=number/10;
		}
		System.out.println("the reverse of the given number is:"+reverse);
		
	
	}

}



