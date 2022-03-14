package com.glearning.pg.client;

import java.util.Scanner;

import com.glearning.pg.model.Employee;
import com.glearning.pg.service.CredentialService;

public class ProfileGeneratorClient {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your option");
		System.out.println("Admin : 0");
		System.out.println("HR : 1");
		System.out.println("Technical : 2");
		System.out.println("Legal  : 3");
		
		int option = scanner.nextInt();
		
		System.out.println("Please enter firstName");
		String firstName = scanner.next();
		
		System.out.println("Please enter lastName");
		String lastName = scanner.next();
		
		Employee employee = new Employee(firstName,lastName);
		
		switch(option) {
		case 0:
			employee.setdept("Admin");
			break;
		case 1:
			employee.setdept("HR");
			break;
		case 2:
			employee.setdept("Legal");
			break;
		case 3:
			employee.setdept("Technical");
			break;
		}
		
		//Call the credential Service
		String email = CredentialService.generateEmailAddress(firstName, lastName, employee.getDept());
		employee.setEmailAddress(email);
		System.out.println(" Please enter the password length");
		int length = scanner.nextInt(10);
		String password = CredentialService.generatePassword(length);
		employee.setPassword(password);
		
		CredentialService.showCredentials(employee);
		
		
		scanner.close();
	}
}
