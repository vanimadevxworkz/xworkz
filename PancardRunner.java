package com.xworkz.pancard.runner;

import java.util.Scanner;

import com.xworkz.pancard.dto.PancardDto;
import com.xworkz.pancard.repository.PancardRepoImpl;
import com.xworkz.pancard.repository.PancardRepository;
import com.xworkz.pancard.service.PancardService;
import com.xworkz.pancard.service.PancardServiceImpl;

public class PancardRunner {
	
	public static void main(String[] args) {
//		PancardDto panDto=new PancardDto("vani",345643469692l,"vanigond09@gmail",6361400696l,"benglore",
//				"Fghd123456","Vani!#@*9");
//		PancardDto panDto1=new PancardDto("uma",345633469693l,"umag09@gmail",6361400676l,"bhatkal",
//				"Lghd123456","Uma!#@*9");
//		PancardDto panDto2=new PancardDto("hita",345653469694l,"hitag09@gmail",6361454066l,"mysore",
//				"Gghd123456","Hani!#@*9");
//		
//		
//		System.out.println("pan card dto:"+panDto.toString());
//		
//		PancardRepository repo=new PancardRepoImpl();
//		
//		PancardService service=new PancardServiceImpl(repo);
//		service.validate(panDto);
//		service.validate(panDto1);
//		service.validate(panDto2);
//		//service.read();
//		
//		//update method
//		String email="vanigond09@gmail";
//		//System.out.println("Before updating");
//		
//		//PancardDto pancardDto=null;
//		
//		PancardDto pancardDto1=new PancardDto();
//		pancardDto1.setEmil("vanimg@gmail");
//		
//		service.update(email,pancardDto1);
//		service.read();
//		
//		service.delete("vanimg@gmail");
//	    service.read();
		Scanner sc=new Scanner(System.in);
				
		String userName;
		System.out.println("enter the values");
		userName=sc.next();
		
		long adharNumber;
		System.out.println("enter adhar number");
		sc.nextLong();
		
		long contactNumber;
		System.out.println("enter contact number");
		sc.nextLong();
		
		String emil;
		System.out.println("enter the mail");
		sc.next();
		sc.close();
	}
	}
