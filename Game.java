package com.xworkz.test.things;

public class Game {
	public static void getGameInformation() {
		System.out.println("this is getGameInforamtion method from the game");
	}
	public static void getGameInformation(String gameName,int numberOfPlayers) {
		System.out.println("game name is:"+gameName+"total players is:"+numberOfPlayers);
	}
	
   public static String getNameOfGame(String gameName) {
	if(gameName=="chess") {
		return gameName;
	}else {
		System.out.println("game is not chess");
		return "not matched";
	}
}
public static boolean indoorGame() {
	System.out.println("indoorGame");
	return true;
}
}