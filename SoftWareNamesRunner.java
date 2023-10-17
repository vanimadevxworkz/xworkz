package com.xworkz.test.driver;

import com.xworkz.test.things.SoftWareNames;

public class SoftWareNamesRunner {
	public static void main(String args[]) {
		SoftWareNames softWareNames= new SoftWareNames();
		softWareNames.getNames("CCleaner");
		softWareNames.getNames("Microsoft Office");
		softWareNames.getNames("Adobe Acrobat");
		softWareNames.getNames("Freeware");
		softWareNames.getNames("windows");
		softWareNames.getNames("Programing Software");
			 
		softWareNames.getList();
				
	}

}
