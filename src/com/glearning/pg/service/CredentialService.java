package com.glearning.pg.service;

import java.util.Random;

import com.glearning.pg.model.Employee;

public class CredentialService {

	
	//generate  email address
	public final static String generateEmailAddress(String firstName, String lastName, String dept) {
		return firstName+"_"+lastName+"@"+dept+"company.com";
	}
	
	//generate password
	//Add final to prevent over-riding
	public final static String generatePassword(int length) {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>";
		
		String seed = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		
		if(length<8) {
			throw new IllegalArgumentException("Password should not be more than 8 "); 
			//TODO : custom made exception
		}
			
		char[] password = new char[length];
		for(int index=0; index < length; index++) {
			int randomNumber = random.nextInt(seed.length());
			char c = seed.charAt(randomNumber);
			password[index] = c;
		}//TODO : create password which contains one of all condition above
		
		return String.copyValueOf(password);
	}
	
	//display password
	public static void showCredentials(Employee employee) {
		
		System.out.println("First Name : "+employee.getFirstName());
		System.out.println("Last Name : "+employee.getLastName());
		System.out.println("Email Address : "+employee.getEmail());
		System.out.println("Password "+employee.getPassword());
		
		
	}
}
