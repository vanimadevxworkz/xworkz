package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Bank {
private String name;
private int totalMembers;
private String maneger;
private String ceo;

public Bank() {
	System.out.println("this is super class constructor");
}
}
