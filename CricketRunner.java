package com.xworkz.test.driver;

import com.xworkz.test.things.Cricket;

public class CricketRunner {
	public static void main(String args[]) {
		String captainName=Cricket.captainName();
			System.out.println("captainName");
		int totalMembers=Cricket.totalMembers();
			System.out.println(totalMembers);
		float over=Cricket.over();
			System.out.println(over);
		byte totalFours=Cricket.totalFours();
			System.out.println(totalFours);
		short score=Cricket.score();
			System.out.println(score);
			long watchingPeople=Cricket.watchingPeople();
				System.out.println(watchingPeople);
			boolean isRainy=Cricket.isRainy();
				System.out.println(isRainy);
				double totalBall=Cricket.totalBall();
					System.out.println(totalBall);
					char batSize=Cricket.batSize();
						System.out.println(batSize);
					}
}
