package com.xworkz.lifeimpl;

import com.xworkz.life.abstracts.Life;
import com.xworkz.life.dto.LifeDto;


public class HumanLife extends Life {

	@Override
	public void lifeStyle() {
		System.out.println("human life style method");
		
	}

	@Override
	public void sadness() {
		System.out.println("this is sadness method ");
		
	}

	@Override
	public void happines() {
		System.out.println("happines method");
		
	}

	@Override
	public void savings() {
		System.out.println("this is savings method");
	}

	@Override
	public void survive() {
		System.out.println("this is survive method");
	}

	@Override
	public void works() {
		System.out.println("works method");
	}

	@Override
	public void family() {
		System.out.println("family method");
		
	}

	@Override
	public void friends() {
		System.out.println("this is friends methods");
	}

	@Override
	public void health() {
		System.out.println("this is health");
		
	}

	@Override
	public void education() {
		System.out.println("education method");
	}
	 Object obj[]=new Object[4];
	    int index=0;
		@Override
		public boolean onSave(LifeDto lifeDto) {
			if(lifeDto!=null) {
				System.out.println("dto is not null");
				if(index<obj.length) {
				obj[index]=lifeDto;
				index++;
				}
			}else {
				System.out.println("dto is   null");
			}
			return false;
		}
	
	

}
