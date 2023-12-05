package com.xworkz.passportapplication.dto;

import java.util.Date;

public class PassportApplicationDto {
	
	private String userName;
	private Date dateOfBirth;
	private String gender;
	private Date registrationDate;
	private String currentAddress;
	private String paymentOption;
	private String permanentAddress;
	private String officeLocation;
	private int age;
	private long contactNumber;
	private String email;
	private int applicationId;
	
	public PassportApplicationDto() {
		System.out.println("no args constructor");
	}

	public PassportApplicationDto(String userName, Date dateOfBirth, String gender, Date registrationDate,
			String currentAddress, String paymentOption, String permanentAddress, String officeLocation, int age,
			long contactNumber, String email, int applicationId) {
		System.out.println("all args constructor");
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.registrationDate = registrationDate;
		this.currentAddress = currentAddress;
		this.paymentOption = paymentOption;
		this.permanentAddress = permanentAddress;
		this.officeLocation = officeLocation;
		this.age = age;
		this.contactNumber = contactNumber;
		this.email = email;
		this.applicationId = applicationId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getUserName() {
		return userName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public int getAge() {
		return age;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public int getApplicationId() {
		return applicationId;
	}

	@Override
	public String toString() {
		System.out.println("this is to string method");
		return "PassportApplicationDto [userName=" + userName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", registrationDate=" + registrationDate + ", currentAddress=" + currentAddress + ", paymentOption="
				+ paymentOption + ", permanentAddress=" + permanentAddress + ", officeLocation=" + officeLocation
				+ ", age=" + age + ", contactNumber=" + contactNumber + ", email=" + email + ", applicationId="
				+ applicationId + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("this is hash code method");
		int result = 11;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassportApplicationDto other = (PassportApplicationDto) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
	
	
	

}
