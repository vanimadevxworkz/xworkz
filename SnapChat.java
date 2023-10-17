package com.xworkz.test.things;

public class SnapChat {
	public String userName;
	public String password;
	public long contactNumber;
	public String email;
	public short strike;
	public int follower;
	
public SnapChat() {
	System.out.println("tis is no arguments method");
}
public SnapChat(String userName,String password,long contactNumber,String email,short strike,int follower) {
	System.out.println("this is parameterized constructor");
	this.userName=userName;
	this.password=password;
	this.contactNumber=contactNumber;
	this.email=email;
	this.strike=strike;
	this.follower=follower;
}
public void getMessage() {
	this.getSendMessage();
System.out.println("this is get message name method with Snapchat");

}
public void getSendMessage() {
System.out.println("this is send meaasge name method with Snapchat");

}
public void getStrikeNumber(int...strikeNumber) {
System.out.println("strikeNumber:"+strikeNumber.length);
for(int i=0;i<strikeNumber.length;i++) {
	System.out.println(strikeNumber[i]);
}

}
public void getfollower(int...follower) {
System.out.println("follower:"+follower.length);
for(int i=0;i<follower.length;i++) {
	System.out.println(follower[i]);
}
}
public void getPasswordName(String...passwordName) {
System.out.println("passwordName:"+passwordName.length);
for(int i=0;i<passwordName.length;i++) {
	System.out.println(passwordName[i]);
}

}
public void getIsGood(boolean...isGood) {
System.out.println("isGood:"+isGood.length);
for(int i=0;i<isGood.length;i++) {
	System.out.println(isGood[i]);
}
}
public void getTotalSticker(int...totalSticker) {
System.out.println("totalSticker:"+totalSticker.length);
for(int i=0;i<totalSticker.length;i++) {
	System.out.println(totalSticker[i]);
}
}
public void getTotalAvtara(int...totalAvatara) {
System.out.println("totalSticker:"+totalAvatara.length);
for(int i=0;i<totalAvatara.length;i++) {
	System.out.println(totalAvatara[i]);
}
}
public void getFilters(int...filters) {
System.out.println("filters:"+filters.length);
for(int i=0;i<filters.length;i++) {
	System.out.println(filters[i]);
}
}
public void getTotalSnap(int...totalSnap) {
System.out.println("totalSnap:"+totalSnap.length);
for(int i=0;i<totalSnap.length;i++) {
	System.out.println(totalSnap[i]);
}
}
public void getIsClarity(boolean...isClarity) {
System.out.println("isClarity:"+isClarity.length);
for(int i=0;i<isClarity.length;i++) {
	System.out.println(isClarity[i]);
}
}
public void getTotalStatus(int...totalStatus) {
System.out.println("totalStatus:"+totalStatus.length);
for(int i=0;i<totalStatus.length;i++) {
	System.out.println(totalStatus[i]);
}
}
}







