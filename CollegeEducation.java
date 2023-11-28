package com.xworkz.educationimpl;

import com.xworkz.education.abstracts.Education;

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

	

}
