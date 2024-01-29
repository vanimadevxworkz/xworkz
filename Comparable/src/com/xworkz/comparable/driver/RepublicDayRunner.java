package com.xworkz.comparable.driver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.xworkz.comparable.RepublicDay;

public class RepublicDayRunner {
	
	public static void main(String[] args) {
		RepublicDay day=new RepublicDay("Benglore", 1000, new Date(), "Modi", 8, "M.krishnappa");
		
		List<RepublicDay> list=new ArrayList<>();
		list.add(day);
		list.add(new RepublicDay("Bhatkal", 500, new Date(), "Modi", 7, "Mankala s Vidya"));
		
		Collections.sort(list);
		System.out.println("sorting:"+list);
		//using Localdate
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
	  
	}

}
