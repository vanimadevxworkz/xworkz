package com.xworkz.life;

import com.xworkz.life.abstracts.Life;
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
	}
	

}
