package com.xworkz.interview.driver;

public class StringMethod {
public static void main(String[] args) {
	
	String s1="Saptasagardache yello";
	String s2="Hello I'm here to meet to";
	String s3="hey this is good time to go to trip";
	String s4="CAN I HELP YOU";
	
	
	System.out.println("total lentgh is:"+s1.length());
	String[] word=s1.split(" ");
	System.out.println("split sentence is:"+word.length);
	
	System.out.println("total char:"+s1.charAt(2));
		
	for(String w:word) {
		System.out.println("total words are:"+w);
		
	}
	String name=s1.substring(4);
	System.out.println("sub string is:"+name);//index start 0,1,2,3....
	
	String name1=s1.toLowerCase();
	System.out.println("lower case:"+name1);
	
	String name2=s1.toUpperCase();
	System.out.println("upper case:"+name2);
	
	String name3=s1.replace('y', 'o');
	System.out.println("replace string is:"+name3);
	
	char ch[]=s1.toCharArray();
	for(int i=0;i<ch.length;i++) {
		System.out.println("to char array is:"+ch[i]);
	
	}
	String n4=s1.concat(name2);
	System.out.println(n4);
	 
	String n5=s1.repeat(4);
	System.out.println("repeat sentence is:"+n5);
	
	String n6=s2.trim();
	System.out.println("trim is:"+n6);
	
	String n7=s1.replaceAll(n5, n6);
	System.out.println("replace all sentence:"+n7);
	
	char[] ch1=s2.toCharArray();
	System.out.println(ch1.length);
	
	for(int i=ch1.length-1;i>=0;i--) {
		System.out.print(ch1[i]);
	}
	
	String n8=s1.intern();
	System.out.println(n8);
	
	String n9=s3.formatted(s3);
	System.out.println(n9);
	
	String n10=s1.resolveConstantDesc(null);
	System.out.println(n10);

	String w=s1.strip();
	System.out.println("strip is:"+w);
	
	String w1=s1.stripIndent();
	System.out.println("strip indent is:"+w1);
	
	String w2=s1.stripLeading();
	System.out.println("strip leading is:"+w2);
	
	String w3=s4.translateEscapes();
	System.out.println("translate escapes:"+w3);
	
	String w4=s1.copyValueOf(ch1);
	System.out.println(w4);
	
	String w5=s1.indent(5);
	System.out.println(w5);
	
	System.out.println(s1.isEmpty());
	
	
	System.out.println(s1.endsWith(s1));
	
	System.out.println(s1.contentEquals(s1));
	
	System.out.println(s1.contains("yello"));
}
}
