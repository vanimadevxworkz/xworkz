package com.xworkz.life;

import com.xworkz.life.abstracts.Life;
import com.xworkz.life.dto.LifeDto;
import com.xworkz.lifeimpl.HumanLife;

public class LifeRunner {
	
	public static void main(String[] args) {
		
		Life life=new HumanLife(); 
		life.education();
		life.family();
		life.friends();
		life.survive();
		life.health();
		life.savings();
		life.lifeStyle();
		life.happines();
		life.works();
		life.sadness();
		
		life.onSave(null);
		life.onSave(null);
		
		LifeDto ld=new LifeDto();
		ld.setHappy(false);
		ld.setLifeStyle(null);
		
		System.out.println(ld.getLifeStyle());
		System.out.println(ld.isHappy());
		
		System.out.println("to string values:"+ld.toString());
		System.out.println("to hash code values:"+ld.hashCode());
		System.out.println("to equals values:"+ld.equals(ld));
	}
	

}
