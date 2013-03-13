/**
 * Program: ContactListUI
 *
 * Author: Team 6
 * Written: Mar 05, 2013
 *
 * Course: CS 001A (Java) Winter 2013
 * Assignment: Final Project
 *
 * Compiler: Java 7.0
 * Platform: Windows 
 *
 * Description : This class is the user interface for the Contact List.
 * It will implement the use cases
 *
 */

import java.util.*;

/**
 * Console based use to handle all use cases
 */
public class ContactListUI {

	private ContactList contactList = new ContactList(); 
	private Scanner scanner = new Scanner(System.in);
	
	public void Show() {
		
		//Define local variable 
		int menuSelected = 0;

		// perform the loop based on user input
		while (menuSelected > -1 && menuSelected < 6  )
		{
			//Display menu 	
			displayMenu();
			// Accept user choice
			menuSelected = scanner.nextInt();
			 
			switch (menuSelected){
			 	case 1: useCase1();
			 			break;
			 	case 2: useCase2();
			 			break;
			 	case 3: useCase3();
			 			break;
			 	case 4: useCase4();
	 					break;
			 	case 5: useCase5();
	 					break;
			}
		}
		
		// Dump the contact list to disk
		writeListToFile();
		scanner.close();
	}


	/**
	 * Main menu 
	 */
	private void displayMenu() {
		System.out.println("************************************************");
		System.out.println("Main Menu:");
		System.out.println("1. Add a new contact");
		System.out.println("2. Print the contact list");
		System.out.println("3. Get contact information by last name");
		System.out.println("4. Get contact information by email address");
		System.out.println("5. Get contact information by zip code");
		System.out.println("************************************************");
		System.out.print("Select menu: ");
		
		//It would be really nice if information was displayed before this menu. So maybe a prompt like "type main to access main menu" -Elena
	}

	/**
	 * Use case 1: 
	 * Enter a new person, Last name contact be blank
	 */
	private void useCase1() {
		//This needs a better method name -Elena
		String firstName = new String();
		String lastName = new String();
		@SuppressWarnings("unused")
		String zipCode = new String();
		String streetAddress = new String();
		String emailAddress = new String();
		String phoneNumber = new String();
		String addedNotes = new String();
		
		// Launch contact details UI
		System.out.print("\n-------------------------------------------------");
		System.out.print("\nEnter contact details");
		System.out.print("\n-------------------------------------------------");

		lastName = getLastName();
		
		// Ensure the first name is entered
		if (lastName.isEmpty() == false)
		{
			System.out.print("-- First name: ");
			firstName = scanner.nextLine();

			System.out.print("-- Street address: ");
			streetAddress = scanner.nextLine();
			
			System.out.print("-- Zip code: ");
			zipCode = scanner.nextLine();

			System.out.print("-- Email address: ");
			emailAddress = scanner.nextLine();
			
			System.out.print("-- Phone number: ");
			phoneNumber = scanner.nextLine();
			
			System.out.print("-- Added notes: ");
			addedNotes = scanner.nextLine();
			
			// Add the new contact into contact list
			contactList.addContact(lastName, firstName, streetAddress, zipCode, emailAddress, phoneNumber, addedNotes);
		}
	}

	/**
	 * Capture a valid last name
	 */
	private String getLastName() {
		String enterName = "";
		String returnName = "";

		scanner.nextLine();
		
		System.out.print("\n-- Enter last name or X to exit : ");
		
		//Ensure you capture the last name	
		while (enterName.isEmpty() == true) {
			
			enterName = scanner.nextLine();
			
			if (enterName.isEmpty() == true)
			{
				System.out.print("\n-- Invalid last name (Enter X to exit) : ");
			}
		} 

		if (enterName.endsWith("X")|| enterName.equals("x"))
		{
			returnName = "";
		} else
		{
			returnName = enterName; 
		}
		
		return returnName ;
	}

	/**
	 * Use case 2: 
	 * Print the contact list. The system prints all 
	 * information about all contacts to the console, 
	 * sorted by last name.
	 */
	private void useCase2() {
		//This needs a better method name -Elena
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t List of all contacts");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(contactList.toString());
	}


	/**
	 * Anaga: 
	 * Use case 3: 
	 * This method searches for then returns the contact details for a person with the entered last name
	 * If last name doesn't match a contact, a message will indicate this
	 * If there are multiple contacts with the last name, all of them will be listed
	 */
	private void useCase3() {
		//This needs a better method name -Elena
		String input_name;
		scanner.nextLine();
		System.out.print("-------------------------------------------------");
		System.out.print(" \n Please Enter the last name of the contact : ");
		input_name = scanner.nextLine();
		Contact contact = (Contact) contactList.searchByLastName(input_name);
			
		 if (contact != null )	{
			System.out.println("Contact Details");
			System.out.println("First Name = " + contact.getFirstName());
			System.out.println("Last Name = " + contact.getLastName());
			System.out.println("Address = " + contact.getStreetAddress());
			System.out.println("Email address = " + contact.getEmailAddress());
			System.out.println("Phone Number = " + contact.getPhoneNumber());
			System.out.println("Notes = " + contact.getAddedNotes());
		 }	else	{
			 System.out.println("No contact found");
		 }
	}


	/**
	 * Anaga: 
	 * Use case 4: 
	 * This method searches for then returns the contact details for a person with the entered email address
	 * If the email doesn't match a that of any contact, a message will indicate this
	 * If there are multiple contacts with the email, all of them will be listed
	 */
	private void useCase4() {
		//This needs a better method name -Elena
		String input_name;
		scanner.nextLine();
		System.out.print("-------------------------------------------------");
		System.out.print("\n Please Enter the email address of the contact : ");
		input_name = scanner.nextLine();
		Contact contact = (Contact) contactList.searchByEmail(input_name);
			if (contact != null )	{
				System.out.println("Contact Details");
				System.out.println("First Name = " + contact.getFirstName());
				System.out.println("Last Name = " + contact.getLastName());
				System.out.println("Address = " + contact.getStreetAddress());
				System.out.println("Email address = " + contact.getEmailAddress());
				System.out.println("Phone Number = " + contact.getPhoneNumber());
				System.out.println("Notes = " + contact.getAddedNotes());
			}	
	 		else	{
				System.out.println("No contact found");
	 	}
			//This method only returns one contact. Use Case 5 says that if there is more than one contact with the same zip, it returns all of them
	}

	/**
	 * Anaga: 
	 * Use case 5: 
	 * This method searches for then returns the contact details for a person with the entered zip code address
	 * If the zip code doesn't match a that of any contact, a message will indicate this
	 * If there are multiple contacts with the zip code, all of them will be listed
	 */
	private void useCase5() {
		
		//This method should have a different, more descriptive name than "useCase5()" - Elena
		
		String input_name;
		scanner.nextLine();
		System.out.println("-------------------------------------------------");
		System.out.print("\n Please Enter the Zip Code of the contact : ");
		input_name = scanner.nextLine();
		Contact contact = (Contact) contactList.searchByZipCode(input_name);
		
		if (contact != null )	{
			System.out.println("Contact Details");
			System.out.println("First Name = " + contact.getFirstName());
			System.out.println("Last Name = " + contact.getLastName());
			System.out.println("Address = " + contact.getStreetAddress());
			System.out.println("Email address = " + contact.getEmailAddress());
			System.out.println("Phone Number = " + contact.getPhoneNumber());
			System.out.println("Notes = " + contact.getAddedNotes());
		}	
		else{
			System.out.println("No contact found");
		}
	}


	/**
	 * Dump the contest to disk before exit
	 */
	private void writeListToFile() {
		System.out.println("Dumping contact list to disk");
		contactList.saveToDisk();
		System.out.println("Done");
	}
	//I have deleted a duplicate of this method -Elena

}


