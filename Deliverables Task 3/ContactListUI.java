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
			 	case 1: newContact();
			 			break;
			 	case 2: printContactList();
			 			break;
			 	case 3: getByLastName();
			 			break;
			 	case 4: getByEmail();
	 					break;
			 	case 5: getByZip();
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
		System.out.println("************************************************");
		System.out.println("1. Add a new contact");
		System.out.println("2. Print the contact list");
		System.out.println("3. Get contact information by last name");
		System.out.println("4. Get contact information by email address");
		System.out.println("5. Get contact information by zip code");
		System.out.println("6. Exit");
		System.out.println("************************************************");
		System.out.print("Select menu: ");
		
		//It would be really nice if information was displayed before this menu. So maybe a prompt like "type main to access main menu" -Elena
		//Satyen: Good catch, I have added the Exit option to  
		//        simulate the behavior of application main window
	}

	/**
	 * Use case 1: 
	 * Enter a new person, Last name contact be blank
	 */
	public void newContact() {
		//will be private (public for testing purposes)
		String firstName = new String();
		String lastName = new String();
		String zipCode = new String();
		String streetAddress = new String();
		String emailAddress = new String();
		String phoneNumber = new String();
		String setNotes = new String();
		
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
			setNotes = scanner.nextLine();
			
			// Add the new contact into contact list
			contactList.addContact(lastName, firstName, streetAddress, zipCode, emailAddress, phoneNumber, setNotes);
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
	public void printContactList() {
		//Will be private
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t List of all contacts");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(contactList.toString());
	}


	/** 
	 * Use case 3: 
	 * This method searches for then returns the contact details for a person with the entered last name
	 * If last name doesn't match a contact, a message will indicate this
	 * If there are multiple contacts with the last name, all of them will be listed
	 */
	private void getByLastName() {
		//code

	}


	/**
	 * Use case 4: 
	 * This method searches for then returns the contact details for a person with the entered email address
	 * If the email doesn't match a that of any contact, a message will indicate this
	 * If there are multiple contacts with the email, all of them will be listed
	 */
	private void getByEmail() {
		//code
	}

	/**
	 * Use case 5: 
	 * This method searches for then returns the contact details for a person with the entered zip code address
	 * If the zip code doesn't match a that of any contact, a message will indicate this
	 * If there are multiple contacts with the zip code, all of them will be listed
	 */
	private void getByZip() {
		//code
	}


	/**
	 * Dump the contest to disk before exit
	 */
	public void writeListToFile() {
		System.out.println("Dumping contact list to disk");
		contactList.saveToDisk();
		System.out.println("Done");
	}
}


