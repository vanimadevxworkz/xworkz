package com.xworkz.test.things;

public class TraineeName {
public static void getName(String[] name) {
	System.out.println("this is name details");
	System.out.println("number of name is:"+name.length);
	for(int i=0;i<name.length;i++) {
		if(name[i]=="sse") {
			System.out.println("sse is present in name");
		}
	System.out.println("Name is:"+name[i]);
		
	}
}
public static void getPlace(String[] place) {
System.out.println("this is place details");
System.out.println("place are:"+place.length);
for(int i=0;i<place.length;i++) {
	if(place[i]=="MadyaPrdesh") {
		System.out.println("it is matched");
	}else {
		System.out.println("it is not matched");
	}
	if(place[i]=="karnataka") {
		System.out.println("it is matched"); 
	}
	System.out.println(place[i]);
}
}
}
