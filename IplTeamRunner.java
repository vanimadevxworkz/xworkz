package com.xworkz.test.driver;

import com.xworkz.test.things.IplTeam;

public class IplTeamRunner {
	public static void main(String args[]) {
		IplTeam IplTeam=new IplTeam();
		IplTeam.save("Rcb");
		IplTeam.save("csk");
		IplTeam.save("mubai indians");
		IplTeam.save("kk");
		
		IplTeam.read();
		
		IplTeam.update("Rcb","sunrisers hydaerabad");
		IplTeam.read();
		System.out.println("it is updated");
		
		IplTeam.delet("kk");
		IplTeam.read();
		System.out.println("it is deleted");
		
		
	}

}
