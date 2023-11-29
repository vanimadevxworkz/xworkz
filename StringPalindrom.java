package com.xworkz.palindrom.things;

public class StringPalindrom {
	public static void main(String[] args) {
		String name="eye";
		String revName=" ";
		System.out.println("length is:"+name.length());
		
		for(int i=0;i<name.length();i++) {
			revName=revName+name.charAt(i);
			System.out.println("rev name is:"+revName);
		}
		if(name.equals(revName)) {
			System.out.println("it is not palindrom");
		}else {
			System.out.println("it is a palindrom");
		
		}
		
	}

}
