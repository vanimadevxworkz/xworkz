package com.xworkz.interview.things;

public class ToggleCase {
	
	public static void main(String[] args) {
		
		String toggleCase="MusicalNight";
		String toggle="";
		
		for(int i=0;i<toggleCase.length();i++) {
			
			if(Character.isUpperCase(toggleCase.charAt(i)))
				toggle=toggle+Character.toLowerCase(toggleCase.charAt(i));
			else
					toggle=toggle+Character.toUpperCase(toggleCase.charAt(i));
			
		}
		System.out.println("toggle case string is:"+toggle);
		
	

}
}
