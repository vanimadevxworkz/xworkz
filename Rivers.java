package com.xworkz.test.things;

public class Rivers {
	public static void getNames(String[] names) {
		System.out.println("this is river name details");
		System.out.println("number of rivers:"+names.length);
		for(int i=0;i<names.length;i++) {
			System.out.println("names are:"+names[i]);
			}
		}
	public static void getNames(String[] names,String[] place) {
		System.out.println("this is rivers  place details");
		System.out.println("number of place:"+place.length);
		for(int i=0;i<place.length;i++) {
			System.out.println("place are:"+place[i]);
		}
	}
	public static void getNames(String[] names,String[] place,String[] birthPlace) {
		System.out.println("this is rivers birthPlace details");
		System.out.println("birthPlace are:"+birthPlace.length);
		for(int i=0;i<birthPlace.length;i++) {
			System.out.println("birthPlace are:"+birthPlace[i]);
			
		}
	}
}

