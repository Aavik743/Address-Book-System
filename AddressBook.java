package com.address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	static ArrayList<Contacts> person = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);
	
	static Contacts contacts = new Contacts();
	
	public void console() {
		
		while(true) {
			System.out.println("-----------------");
			System.out.println("Choose,");
			System.out.println("1. Create contact");
			System.out.println("2. Edit contact");
			System.out.println("3. Delete contact");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			
			int option = sc.nextInt();
			
			switch (option) {
			
				case 1:
					createContacts();
					break;
				case 2:
					editContact();
					break;
				case 3:
					toDelete();
					break;
				case 4:
					System.out.println("Exited...");
					System.exit(0);
				default:
					System.out.print("Enter a valid option: ");
			}
		}
	}
	
	

	public void createContacts() {
		
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
		System.out.println("Contact " + firstName + " created sucessfully");
		
	}

	 public void editContact() {
         System.out.print("Enter the first name you want to edit:");
         
         String first = sc.next();
         
         boolean isPerson = false;
         
         for(int i=0;i<person.size();i++) {
        	 if(person.get(i).getFirstName().equals(first)) {
        		 
        		 isPerson = true;
        		 
        		 person.get(i).setFirstName(first);
        		 
        		 System.out.print("Enter Last Name:");
        		 String lastName = sc.next();
        		 person.get(i).setLastName(lastName);
        		 
        	     System.out.print("Enter Address:");
         		 String address = sc.next();
         		 person.get(i).setAddress(address);
         		 
         		 System.out.print("Enter state:");
         		 String state = sc.next();
         		 person.get(i).setState(state);
         			
         		 System.out.print("Enter zip:");
         		 String zip = sc.next();
         		 person.get(i).setZip(zip);
         			
         		 System.out.print("Enter phoneNumber:");
         		 String phoneNumber = sc.next();
         		 person.get(i).setPhoneNumber(phoneNumber);
       
         		 System.out.print("Enter email:");
         		 String email = sc.next();
         		 person.get(i).setEmail(email);
         			
        		 System.out.println("Contact edited sucessfully");
        	 }
      	 
         }
         if (!isPerson)
         System.out.println("Contact could not be found");
	 }
	 
	 public void toDelete() {
         System.out.println("Enter the first name of the contact to be deleted");
         String firstName = sc.next();
         
         for(int i=0;i<person.size();i++) {
        	 if(person.get(i).getFirstName().equals(firstName)) {
        		 person.remove(person.get(i));
        		 System.out.println("Contact removed sucessfully");
        	 }
        	 else {
        		 System.out.println("Contact not found");
        	 }
        	 
         }
     }
	 
} 
