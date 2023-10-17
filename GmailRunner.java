package com.xworkz.test.driver;

import com.xworkz.test.things.Gmail;
public class GmailRunner {
	public static void main(String...args) {
		Gmail gmail=new Gmail();
		gmail.getMessage();
		//gmail.getSendMeaasge();
		gmail.getContactNumbers(12,34);
		gmail.getContactName("vani","pinki","moni");
	}

}
