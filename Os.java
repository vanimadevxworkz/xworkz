package com.xworkz.test.things;

public class Os {
	public static void getOsInformation() {
		System.out.println("this is getOsInformtion method from the os");
	}
	public static void getOsInformation(String OsName,double version) {
		System.out.println("name of the os is:"+OsName+"version of os:"+version);
		if(OsName=="window") {
			System.out.println("osName is matched with window"+version);
		}else {
			System.out.println("OsName is not matched with window");
	
		}
	}
public static boolean getVersion() {
	System.out.println("getVersion");
	return true;
}
}
