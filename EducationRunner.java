package com.xworkz.education;

import com.xworkz.education.abstracts.Education;
import com.xworkz.educationimpl.CollegeEducation;

public class EducationRunner {
	
	public static void main(String[] args) {
		
		Education education=new CollegeEducation();
		education.department();
		education.minister();
		education.commite();
		education.educationType();
	}

}
