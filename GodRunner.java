package com.xworkz.test.driver;

import com.xworkz.test.things.God;

public class GodRunner {
	public static void main(String args[]) {
		God.godName();
		God.godType("men");
		String special=God.special();
		System.out.println(special);
		String name=God.getName("vinayka");
		
	}
}
