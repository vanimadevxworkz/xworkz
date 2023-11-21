package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Remote;

public class RemoteRunner {
	public static void main(String[] args) {
	 Remote remote = new Remote();
	 Remote remote1=new Remote();
	 
	 System.out.println("get class method:"+remote.getClass());
		System.out.println("object class method:"+remote.toString());
		System.out.println("remote hash code method:"+remote.hashCode());
		System.out.println("remote1 hash code method:"+remote1.hashCode());
		//System.out.println(remote.equals(remote));
		System.out.println(remote.equals(remote1));
	}
	}


