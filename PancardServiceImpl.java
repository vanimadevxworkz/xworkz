package com.xworkz.pancard.service;

import com.xworkz.pancard.dto.PancardDto;
import com.xworkz.pancard.repository.PancardRepository;

public class PancardServiceImpl implements PancardService {
  
	
	private PancardRepository repository;
	public PancardServiceImpl(PancardRepository repository) {
		this.repository=repository;
	}
	
	boolean validateName=true;
	boolean validateAdhar=true;
	boolean validateEmail=true;
	boolean validateNumber=true;
	boolean validateAddress=true;
	boolean validatePan=true;
	boolean validatePassword=true;
	@Override
	public boolean validate(PancardDto pancardDto) {
		System.out.println("dto is running");
		System.out.println("pan card dto:"+pancardDto);
		if(pancardDto==null) {
			System.out.println("dto is null");
		}else {
			if(pancardDto.getUserName().isEmpty()
				||pancardDto.getUserName().isBlank()
				||pancardDto.getUserName()==null
				|pancardDto.getUserName().length()<2) {
				System.out.println("check the length or unique");
				validateName=false;
			}
			long adhraNumber=pancardDto.getAdharNumber();
			int count1=0;         
			while(adhraNumber>0) {
				adhraNumber=adhraNumber/10;
				count1++;
		}
			if(count1!=12) {
				System.out.println("adhar number not contain 12 digits");
				return false;
			}
			if(pancardDto.getEmil().isEmpty()
			 ||pancardDto.getEmil().isBlank()
			 ||pancardDto.getEmil()==null
			 ||!pancardDto.getEmil().contains("@")
			 ||pancardDto.getEmil().length()<2) {
				System.out.println("check the length or contains @");
				validateEmail=false;
			}
				long contact=pancardDto.getContactNumber();
				int count=0;        // 123456/10=12345
				while(contact>0) {
					contact=contact/10;
					count++;
			}
				if(count!=10) {
					System.out.println("contact number not contain 10 digits");
					return false;
				}
			if(pancardDto.getPresentAddress().isEmpty()
			  ||pancardDto.getPresentAddress().isBlank()
			  ||pancardDto.getPresentAddress()==null
			  ||pancardDto.getPresentAddress().length()<5) {
				System.out.println("legth should be 5");
				validateAddress=false;
			}
			if(pancardDto.getPanNumber().isEmpty()
				||pancardDto.getPanNumber().isBlank()
				||pancardDto.getPanNumber()==null
				||pancardDto.getPanNumber().length()!=10) {
			
				System.out.println("check the pan card details");
				validatePan=false;
			}
			 //first letter should be upper             
			char firstletter=pancardDto.getPanNumber().charAt(0);
			if(!(Character.isUpperCase(firstletter))) {
				System.out.println(" pan first number always upper");
				return false;
			}
			//second letter should be lower
			char secondletter=pancardDto.getPanNumber().charAt(1);
			if(!(Character.isLowerCase(secondletter))) {
				System.out.println(" pan second number always lower");
				return false;
			
			}
			//last char should be digit (0123456789)
			char lastChar=pancardDto.getPanNumber().charAt(9);
			if(!(Character.isDigit(lastChar))) {
				System.out.println(" last char should bu number");
				return false;
			
			}
			if(pancardDto.getPassword().isEmpty()
			||pancardDto.getPassword().isBlank()
			||pancardDto.getPassword()==null
			||pancardDto.getPassword().length()<8
			||pancardDto.getPassword().length()>16
			||pancardDto.getPassword().contains("a-z")
			||pancardDto.getPassword().contains("!,#,@,*")){
				System.out.println("check the password details");
				validatePassword=false;
				
			}
			//||pancardDto.getPassword().toUpperCase())
			
			if(validateName&&validateAdhar&&validateEmail&&validateNumber&&validateAddress&&
					validatePan&&validatePassword) {
				System.out.println("validation done");
			
		 
				boolean exist=isExist(pancardDto);
				if(exist!=true) {
					
				
		boolean save=this.repository.onSave(pancardDto);
		if(save) {
			System.out.println("dto saved successfully");
			return true;
		}else {
			System.out.println("not saved ");
			return false;
		}}else {
			System.out.println("dto is already exist");
		}
		
			}
			}
		
		return false;
	}
	@Override
	public boolean isExist(PancardDto pancardDto) {
		PancardDto[] dto=this.repository.read();
		if(dto!=null) {
			for(PancardDto dto1:dto) {
				if(dto1!=null) {
					if(dto1.equals(pancardDto)) {
						return true;
					}
				}
			}
			
		}
		return false;
	}
	
	@Override
	public boolean update(String email, PancardDto pancardDto1) {
		boolean update=this.repository.update(email,pancardDto1);
		if(update) {
			System.out.println("update successfully");
			return true;
		}else {
			System.out.println("not update");
		}
		return false;
	}
	@Override
	public void read() {
		PancardDto[] dto=this.repository.read();
		for(PancardDto dto1:dto) {
			System.out.println(dto1);
		
	}

}
	@Override
	public boolean delete(String email) {
		boolean delete=this.repository.delete(email);
		if(delete) {
			System.out.println("deleted successfull");
			return true;
		}else {
			System.out.println("not deleted");
			
		}
		return false;
	}
}
