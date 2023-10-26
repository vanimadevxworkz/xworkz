package com.xworkz.test.driver;

import com.xworkz.test.things.Holiday;

public class HolidayRunner {
	public static void main(String args[]) {
		Holiday holiday=new Holiday();
		holiday.holidayFor="dasara";
		holiday.numberOfDays=4;
		holiday.partyName="dasara";
		holiday.holidayPlan="going temple";
		System.out.println("holiday for:"+holiday.holidayFor);
		System.out.println("number of days:"+holiday.numberOfDays);
		System.out.println("partyname:"+holiday.partyName);
		System.out.println("holiday planing:"+holiday.holidayPlan);
		
	}

}
