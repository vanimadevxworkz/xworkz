package com.xworkz.jobportal.repository;

public class JobportalRepoImpl  implements JobportalRepository {
     
	
	 private String[] app=new String[5];
	 private int index=0;
	 
	public String[] getApp() {
		return app;
	}



	@Override
	public boolean onSave(String names) {
		if(app==null||index>=app.length) {
			System.out.println("app name is null or check the length");
		}else {
			
			if(index<app.length) {
				app[index]=names;
				index++;
				return true;
			}
		}
		return false;
	}



	@Override
	public String[] read() {
		
		return app;
	}

}
