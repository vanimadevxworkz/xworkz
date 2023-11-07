package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Channel;

public class TelevisionRunner {
	public static void main(String args[]) {
		Channel channel=new Channel();
		channel.getTelevision("airtel");
		channel.getTelevisionInfo(4);
		channel.getName((byte)2);
		
		/*channel.name="airtel";
		channel.type=5;
		channel.totalItem=3;
		
		System.out.println(channel.name);
		System.out.println(channel.type);
		System.out.println(channel.totalItem);*/
		
	}

}
