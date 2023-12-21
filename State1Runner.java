package com.xworkz.state.runner;

import com.xworkz.state.repository.StateRepoImpl;
import com.xworkz.state.repository.StateRepository;
import com.xworkz.state.service.StateService;
import com.xworkz.state.service.StateServiceImpl;

public class State1Runner {
	
	public static void main(String[] args) {
		
		StateRepository repository=new StateRepoImpl();
		
		StateService service=new StateServiceImpl(repository);
		service.validate("karnataka");
		service.validate("goa");
	    service.validate("rajastna");
	    service.validate("kerala");
	    service.validate("andra");
	}

}
