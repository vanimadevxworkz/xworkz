package com.xworkz.pancard.repository;

import com.xworkz.pancard.dto.PancardDto;

public class PancardRepoImpl implements PancardRepository {
 
	
	private PancardDto[] dto=new PancardDto[3];
	int index=0;
	@Override
	public boolean onSave(PancardDto pancardDto) {
		if(index<this.dto.length) {
			dto[this.index]=pancardDto;
			this.index++;
			return true;
			}

		return false;
	}
	@Override
	public PancardDto[] read() {
		System.out.println("reading dto... ");
		return dto;
	}
	@Override
	public boolean update(String email, PancardDto pancardDto) {
		for(int i=0;i<this.dto.length;i++) {
			if(this.dto[i] != null) {
				if(this.dto[i].getEmil().equals(email)) {
					this.dto[i]=pancardDto;
					return true;
				}
				
				
			}
		}
		return false;
	}

	@Override
	public boolean delete(String email) {
		for(int i=0;i<this.dto.length;i++) {
			if(this.dto[i]!=null) {
				if(this.dto[i].getEmil().equals(email)) {
					this.dto[i]=null;
					return true;
				}
			}
		}
		return false;
	}
	
	
		}


