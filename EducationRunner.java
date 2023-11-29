package com.xworkz.education;

import com.xworkz.education.abstracts.Education;
import com.xworkz.education.dto.EducationDto;
import com.xworkz.educationimpl.CollegeEducation;

public class EducationRunner {
	
	public static void main(String[] args) {
		
		Education education=new CollegeEducation();
		education.department();
		education.minister();
		education.commite();
		education.educationType();
		
		//on save method
		
		education.onSave(null);
		education.onSave(null);
		education.onSave(null);
		
		//creating new object
		
		EducationDto ed=new EducationDto();
		ed.setEduMinister("dr.sudhakar");
		ed.setCommite("education commit");
		ed.setType(2);
		
		System.out.println(ed.getEduMinister());
		System.out.println(ed.getCommite());
		System.out.println(ed.getType());
		
		System.out.println("to string method:"+ed.toString());
		System.out.println("hash code method:"+ed.hashCode());
		//System.out.println("equlas method:"+ed.equals(ed));
		System.out.println("equlas method:"+ed.equals(education));
	}

}
