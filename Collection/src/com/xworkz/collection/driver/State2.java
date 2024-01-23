package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.List;

public class State2 {
	public static void main(String[] args) {
		List<String> stateList=new ArrayList<String>();
		
		stateList.add("Karnataka");
		stateList.add("Andra pradesh");
		stateList.add("Arunachal Pradesh");
		stateList.add("Assam");
		stateList.add("Bihar");
		stateList.add("Chattishgarh");
		stateList.add("Goa");
		stateList.add("Gujarat"); 
		stateList.add("Haryana");
		stateList.add("HimachalPradesh");
		stateList.add("Jarkhanda");
		stateList.add("Kerala");
		stateList.add("Madya Prdesh");
		stateList.add("Maharastra");
		stateList.add("Manipur");
		stateList.add("Meghalaya");
		stateList.add("Mizoram");
		stateList.add("Nagalanda");
		stateList.add("Odisha");
		stateList.add("Punjab");
		stateList.add("Rajastna");
		stateList.add("Sikkim");
		stateList.add("TamilNadu");
		stateList.add("telangana");
		stateList.add("tripura");
		stateList.add("Uttara pradesh");
		stateList.add("uttaraKhanda");
		stateList.add("West bengal");
		
		System.out.println(stateList);
		System.out.println("check karnataka is present:"+stateList.contains("Karnataka"));
		System.out.println("remove tamilnadu from the list:"+stateList.remove("TamilNadu"));
		System.out.println(stateList.size());
		System.out.println(stateList);
				
	}

}
