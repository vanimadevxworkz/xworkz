package com.xworkz.entertainment.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.entertainment.things.Entertainment;

public class EntertainmentRunner {
	
	public static void main(String[] args) {
		Entertainment entertainment=new Entertainment("AnnualDay","Benglore", "siddu", 100,
				LocalDate.of(2021, 11, 9));
		//System.out.println(entertainment);
		
		List<Entertainment> list=new ArrayList<Entertainment>();
		list.add(entertainment);
		list.add(new Entertainment("holi","manglore","guest1",500,LocalDate.of(2022, 8, 25)));
		list.add(new Entertainment("Fest","mysore","Guest2",250,LocalDate.of(2023, 9, 12)));
		list.add(new Entertainment("onm","kerla","guest3",500,LocalDate.of(2019, 8, 25)));
		list.add(new Entertainment("spectrum","manglore","Principal",300,LocalDate.of(2024, 1, 14)));
		list.add(new Entertainment("Exibition","bhatkal","people",700,LocalDate.of(2020, 6, 20)));
		list.add(new Entertainment("roadstreat","benglore","noGuest",100,LocalDate.of(2018, 5, 25)));
		list.add(new Entertainment("hostelDay","udupi","warden",400,LocalDate.of(2023, 5, 20)));
		list.add(new Entertainment("namingcermony","Bhatkal","relations",500,LocalDate.of(2024, 1, 25)));
		list.add(new Entertainment("festival","india","guest",500,LocalDate.of(2020, 8, 25)));
		//System.out.println(list);
		
		list.sort(Comparator.comparing(Entertainment::getEventName));
		System.out.println(list);
	}
}
