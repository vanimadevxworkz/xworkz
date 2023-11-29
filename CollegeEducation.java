package com.xworkz.educationimpl;

import com.xworkz.education.abstracts.Education;
import com.xworkz.education.dto.EducationDto;


public class CollegeEducation extends Education{


	public void department() {
		System.out.println("this is education department method");
		
	}

	@Override
	public void minister() {
		System.out.println("education minister is dr.m.c.sudhakar");
		
	}

	@Override
	public void educationType() {
		System.out.println("education type are");
	}

	@Override
	public void commite() {
		System.out.println("education commite");
		
	}
	
	 Object obj[]=new Object[3];
	    int index=0;
		@Override
		public boolean onSave(EducationDto educationDto) {
			if(educationDto!=null) {
				System.out.println("dto is not null");
				if(index<obj.length) {
				obj[index]=educationDto;
				index++;
				}
			}else {
				System.out.println("dto is   null");
			}
			return false;
		}

	

}
