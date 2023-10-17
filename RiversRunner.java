package com.xworkz.test.driver;
import com.xworkz.test.things.Rivers;

public class RiversRunner {
public static void main(String args[]) {
	String[] names= {"Kaveri","Yamuna","Ganga","Brahmputra","Chambal"};
	Rivers.getNames(names);
	String[] place= {"Talkaveri","Yamunotri","Gangotri","HimalayanGlacierInTibet","TributaryOfYamuna"};
	Rivers.getNames(names,place);
	String[] birthPlace= {"Tamilnadu","Uttarkhanda","Uttarkhanda","ArunachalaPradesh","MadhyaPradesh"};
	Rivers.getNames(names,place,birthPlace);
}
}
 