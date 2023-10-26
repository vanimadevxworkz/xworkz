package com.xworkz.test.driver;

import com.xworkz.test.things.WorldCup;

public class WorldCupRunner {
	public static void main(String args[]) {
		WorldCup worldCup=new WorldCup();
		System.out.println("hostname is:"+worldCup.hostName);
		System.out.println("numberOfTeams are:"+worldCup.numberOfTeams);
		System.out.println("numberof matches are:"+worldCup.numberOfMatches);
		System.out.println("year is:"+worldCup.year);
	}

}
