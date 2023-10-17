package com.xworkz.test.driver;

import com.xworkz.test.things.Games;

public class GamesRunner {
	public static void main(String args[]) {
		Games games=new Games();
		games.onSave("football");
		games.onSave("cricket");
		games.onSave("chess");
		games.onSave("basketball");
		games.onSave("ludo");
		games.onSave("kabddi");
		
		games.read();
		
		games.update("football","khokho");
		games.read();
		System.out.println("it is updated");
		
		games.delet("chess");
		games.read();
		System.out.println("it is deleted");
		
				
	}

}
