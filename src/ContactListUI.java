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

	//-----------------------  INSTANCE VARIABLES ----------------------------- 
	
	private ContactList contactList = new ContactList(); 
	private Scanner scanner = new Scanner(System.in);
	// As advised by John
	private Boolean dataChanged = false;
	
	//-------------------------- PUBLIC METHODS -------------------------------
	public void Show() {
		
		//Define local variable 
		int menuSelected = 0;

		// perform the loop based on user input
		while (menuSelected > -1 && menuSelected < 3  )
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
			 	case 3: searchBy();
			 			break;
			}
		}
		
		// Dump the contact list to disk
		if (dataChanged == true){
			writeListToFile();
		}
		scanner.close();
		System.out.println("Thank you");
	}

	
	//-------------------------- PRIVATE METHODS ------------------------------ 
	/**
	 * Main menu 
	 */
	private void displayMenu() {
		System.out.println("************************************************");
		System.out.println("Main Menu:");
		System.out.println("************************************************");
		System.out.println("1. Add a new contact");
		System.out.println("2. Print the contact list");
		System.out.println("3. Get contact information");
		System.out.println("4. Exit");
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
	private void newContact() {
		//This needs a better method name -Elena
		String firstName = new String();
		String lastName = new String();
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
			// Set the data changed flag to true
			dataChanged = true;

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
	private void printContactList() {
		//This needs a better method name -Elena
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t List of all contacts");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(contactList.toString());
	}

	/**
	 * Elena: search select method
	 * This method is called when a user chooses to search for a contact.
	 * It directs the program to the appropriate getBy method.
	 */
	private void searchBy() {
		
		//Define local variable
		int menuSelected = 0;

		// perform loop based on user input

		while ( menuSelected > -1 && menuSelected < 4 ) {

			//menu
			System.out.println("************************************************");
			System.out.println("1. Search by last name");
			System.out.println("2. Search by email");
			System.out.println("3. Search by zip code");
			System.out.println("4. Back to Main Menu");
			System.out.println("************************************************");
			System.out.println("Select Menu:");

			//accept user choice
			menuSelected = scanner.nextInt();

			switch (menuSelected) {
				case 1: getByLastName();
						break;
				case 2: getByEmail();
						break;
				case 3: getByZip();
						break;
			} //close switch
			
		} //close while
		Show();
	} // close searchBy()
	
	/**
	 * Anaga: Use case 3: 
	 * This method searches for then returns the contact details for a person with the entered last name
	 * If last name doesn't match a contact, a message will indicate this
	 * If there are multiple contacts with the last name, all of them will be listed
	 */
	private void getByLastName() {
		//This needs a better method name -Elena
		//Satyen: Changed this method to handle multiple contacts with same last name
		String input_name;
		scanner.nextLine();
		System.out.print("-------------------------------------------------");
		System.out.print(" \n Please Enter the last name of the contact : ");
		input_name = scanner.nextLine();
		System.out.println(contactList.searchContacts(1, input_name));
	}

	/**
	 * Anaga: Use case 4: 
	 * This method searches for then returns the contact details for a person with the entered email address
	 * If the email doesn't match a that of any contact, a message will indicate this
	 * If there are multiple contacts with the email, all of them will be listed
	 */
	private void getByEmail() {
		//Satyen: Changed this method to return multiple contacts

		String emailAddress;
		scanner.nextLine();
		System.out.print("-------------------------------------------------");
		System.out.print("\n Please Enter the email address of the contact : ");
		emailAddress = scanner.nextLine();
		System.out.println(contactList.searchContacts(2, emailAddress));
		//Elena: This method only returns one contact. Use Case 5 says that if there is more than one contact with the same zip, it returns all of them
		//Satyen: Great catch Elena
		//Satyen: Also we should allow partial search (Ex. raj should return your contact) 
	}

	/**
	 * Anaga: Use case 5: 
	 * This method searches for then returns the contact details for a person with the entered zip code address
	 * If the zip code doesn't match a that of any contact, a message will indicate this
	 * If there are multiple contacts with the zip code, all of them will be listed
	 */
	private void getByZip() {
		//Satyen: Changed this method to return multiple contacts
		String zipCode;
		scanner.nextLine();
		System.out.println("-------------------------------------------------");
		System.out.print("\n Please Enter the Zip Code of the contact : ");
		zipCode = scanner.nextLine();
		System.out.println(contactList.searchContacts(3, zipCode));
	}

	/**
	 * Dump the contact list to disk before exit
	 */
	private void writeListToFile() {
		System.out.println("Updating contact to disk file");
		contactList.saveToDisk();
		System.out.println("Done");
	}

}


