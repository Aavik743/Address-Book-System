package com.address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	static ArrayList<Contacts> person = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);
	
	public void console() {
		
		System.out.println("-----------------");
		System.out.println("Choose,");
		System.out.println("1. Create contact");
		System.out.println("2. Exit");
		System.out.print("Enter your choice: ");
		
		int option = sc.nextInt();
		
		while(true) {
			
			switch (option) {
			
				case 1:
					createContacts();
					break;
				case 2:
					System.out.println("Exited...");
					System.exit(0);
				default:
					System.out.println("Enter a valid option");
			}
		}
	}

	public void createContacts() {
		Contacts contacts = new Contacts();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter first Name:");
		String firstName = sc.nextLine();
		contacts.setFirstName(firstName);
		
		System.out.println("Enter Last Name:");
		String lastName = sc.nextLine();
		contacts.setLastName(lastName);
		
		System.out.println("Enter Address:");
		String address = sc.nextLine();
		contacts.setAddress(address);
		
		System.out.println("Enter city:");
		String city = sc.nextLine();
		contacts.setCity(city);
		
		System.out.println("Enter state:");
		String state = sc.nextLine();
		contacts.setState(state);
		
		System.out.println("Enter zip:");
		String zip = sc.nextLine();
		contacts.setZip(zip);
		
		System.out.println("Enter phoneNumber:");
		String phoneNumber = sc.nextLine();
		contacts.setPhoneNumber(phoneNumber);
		
		System.out.println("Enter email:");
		String email = sc.nextLine();
		contacts.setEmail(email);
		
		person.add(contacts);
		System.out.println("person created sucessfully");
	}


}
