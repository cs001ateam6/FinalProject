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
	
	/**
	 * Elena: This method loads a contact list from disk, and creates a new data.ser file if it does not already exist.
	 */
	public void loadContactList() { 
		//Load Contact List
		contactList.readFromDisk(); //this way readFromDisk() is not used in the constructor
	}
	
	/**
	 *Satyen: This method displays the user interface, and contains the loop that makes it usable.
	 */
	public void Show() {
		
		//Define local variable 
		int menuSelected = 0;
		
		//removed readFromDisk from the show method, as this created duplicate contacts when Show() was executed from searchBy()

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
			 			break; //fixed to 3 options instead of 5 - Elena
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
	 * Elena: Displays the Main Menu. 
	 */
	private static void displayMenu() {
		System.out.println("************************************************");
		System.out.println("Main Menu:");
		System.out.println("************************************************");
		System.out.println("1. Add a new contact");
		System.out.println("2. Print the contact list");
		System.out.println("3. Get contact information");
		System.out.println("4. Exit");
		System.out.println("************************************************");
		System.out.print("Select menu: ");
	}

	/**
	 * Elena: Use case 1: 
	 * Enter a new person, Last name contact be blank
	 */
	public void newContact() {
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
	 * Satyen: Capture a valid last name
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
	 * Anaga: Use case 2: 
	 * Print the contact list. The system prints all 
	 * information about all contacts to the console, 
	 * sorted by last name.
	 */
	public void printContactList() {
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
		Show(); // allows return to main menu
	} // close searchBy()
	
	/**
	 * Anaga: Use case 3: 
	 * This method searches for then returns the contact details for a person with the entered last name
	 * If last name doesn't match a contact, a message will indicate this
	 * If there are multiple contacts with the last name, all of them will be listed
	 */
	private void getByLastName() {
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
		String emailAddress;
		scanner.nextLine();
		System.out.print("-------------------------------------------------");
		System.out.print("\n Please Enter the email address of the contact : ");
		emailAddress = scanner.nextLine();
		System.out.println(contactList.searchContacts(2, emailAddress));
	}

	/**
	 * Anaga: Use case 5: 
	 * This method searches for then returns the contact details for a person with the entered zip code address
	 * If the zip code doesn't match a that of any contact, a message will indicate this
	 * If there are multiple contacts with the zip code, all of them will be listed
	 */
	private void getByZip() {
		String zipCode;
		scanner.nextLine();
		System.out.println("-------------------------------------------------");
		System.out.print("\n Please Enter the Zip Code of the contact : ");
		zipCode = scanner.nextLine();
		System.out.println(contactList.searchContacts(3, zipCode));
	}

	/**
	 * Dumps the contact list to disk. Used before exit.
	 */
	private void writeListToFile() {
		System.out.println("Updating contact to disk file");
		contactList.saveToDisk();
		System.out.println("Done");
	}

}


