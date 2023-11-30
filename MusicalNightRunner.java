package com.xworkz.musicalnightrunner;

import com.xworkz.musicalnight.abstracts.MusicalNight;
import com.xworkz.musicalnight.constant.Guest;
import com.xworkz.musicalnight.dto.MusicalNightDto;
import com.xworkz.musicalnightimplimentation.Pub;

public class MusicalNightRunner {
	
	public static void main(String[] args) {
		
		MusicalNight mn=new Pub();
		mn.onSave(null);
		mn.onSave(null);
		mn.onSave(null);
		System.out.println("this is on save method");
		
		mn.read();
		System.out.println("this is read method");
		
		//create a another object
		
		MusicalNightDto md=new MusicalNightDto();
		md.setType("pub party");;
		md.setTotalPeople(200);
		md.setTime(10.30);
		md.setSingerName("vp");
		md.setProfeesional(false);
		md.setPosterName("abcd");
		md.setPlace("benglore");
		md.setPartyName("fun party");
		md.setOrganisedName("xxx");
		md.setNumOfEquipment(9);
		md.setNumOfDj(3);
		md.setLatestSong(null);
		md.setIncomeOfDj(25000);
		md.setGuestName(Guest.MP.toString());
		md.setGroupName("zzz");
		md.setGood(true);
		md.setGameName("yyyy");
		md.setEntryFees(100);
		md.setDjPrice(30000);
		md.setDjName(null);
		md.setDay("sun");
		md.setDate("2024-1-1");
		md.setCollegeFest(false);
		md.setBestDjName("vvv");
		md.setAtomosphere("good");
		
		System.out.println(md.isProfeesional());
		System.out.println(md.getAtomosphere());
		System.out.println(md.getBestDjName());
		System.out.println(md.getDate());
		System.out.println(md.getDay());
		System.out.println(md.getDjName());
		System.out.println(md.getDjPrice());
		System.out.println(md.getEntryFees());
		System.out.println(md.getGameName());
		System.out.println(md.getGroupName());
		System.out.println(md.getGuestName());
		System.out.println(md.getIncomeOfDj());
		System.out.println(md.getLatestSong());
		System.out.println(md.getNumOfDj());
		System.out.println(md.getNumOfEquipment());
		System.out.println(md.getOrganisedName());
		System.out.println(md.getPartyName());
		System.out.println(md.getPlace());
		System.out.println(md.getPlace());
		System.out.println(md.getPosterName());
		System.out.println(md.getSingerName());
		System.out.println(md.getTime());
		System.out.println(md.getTotalPeople());
		System.out.println(md.getType());
		System.out.println(md.isCollegeFest());
		
		System.out.println("to string values:"+md.toString());
		System.out.println("hash code values:"+md.hashCode());
		System.out.println("equals values:"+md.equals(md));
		
		
		
		
		
		
	}

}
