package com.xworkz.musicalnightimplimentation;

import com.xworkz.musicalnight.abstracts.MusicalNight;
import com.xworkz.musicalnight.dto.MusicalNightDto;

public class Pub extends MusicalNight {
	
	Object obj[]=new Object[3];
	int index=0;
	
	public boolean onSave(MusicalNightDto musicalNightDto) {
		if(musicalNightDto!=null) {
			System.out.println("dto is not null");
			if(index<obj.length) {
				obj[index]=musicalNightDto;
				index++;
			}
		}else {
			System.out.println("dto is null");
		}

		return false;
	}
	
	public void read() {
		for(Object object:obj) {
			System.out.println("read method object:"+object);
		}
	}
	

}
