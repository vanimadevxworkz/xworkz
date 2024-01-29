package com.xworkz.scam.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.scam.things.Scam;

public class ScamRunner {
	
	public static void main(String[] args) {
		Scam scam=new Scam("financial scam", "india", false, 20, LocalDate.of(2021, 6, 12));
		
		List<Scam> list=new ArrayList<Scam>();
		list.add(scam);
		list.add(new Scam("UpiScam","india",true,25,LocalDate.of(2022, 1, 15)));
		list.add(new Scam("creditcardScam","india",true,15,LocalDate.of(2023, 1, 13)));
		list.add(new Scam("Bankfrauds","india",false,30,LocalDate.of(2023, 1, 15)));
		list.add(new Scam("Qrcode","india",true,25,LocalDate.of(2023, 9, 20)));
		list.add(new Scam("part-time job scam","india",true,25,LocalDate.of(2023, 4, 30)));
		list.add(new Scam("Courier Scam","India",false,20,LocalDate.of(2024, 6, 7)));
		list.add(new Scam("cyberScam","india",true,25,LocalDate.of(2019, 5, 5)));
		list.add(new Scam("banking","india",true,25,LocalDate.of(2022, 1, 15)));
		
		list.sort(Comparator.comparing(Scam::getName));
		
	
		
		
	}

}
