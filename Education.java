package com.xworkz.education.abstracts;

import com.xworkz.education.dto.EducationDto;

public abstract class Education {
	public abstract void department();
	
	public abstract void minister();
	
	public abstract void educationType();
	
	public abstract void commite();
	
	public abstract boolean onSave(EducationDto educationDto);
	


}
