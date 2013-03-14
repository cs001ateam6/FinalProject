/**
 * Program: ContactListUI
 *
 * Author: Team 6
 * Written: Mar 12, 2013
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
	 * Display a menu for all use cases
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
		System.out.println("************************************************");
		System.out.print("Select menu: ");
	}

	/**
	 * Use case 1: 
	 * Enter a new person, Last name contact be blank
	 */
	private void useCase1() {
		System.out.println("-------------------------------------------------");
		System.out.println("Enter contact details");
		System.out.println("-------------------------------------------------");
		System.out.println("\t First mame: ");
		System.out.println("\t Last name: ");
		System.out.println("\t Street address: ");
		System.out.println("\t Zip code: ");
		System.out.println("\t Email address: ");
		System.out.println("\t Phone number: ");
		System.out.println("\t Added notes: ");

		//Will launch the Enter Contact Details UI
		//Will ensure last name is entered
		//Will add new contact to contact list
	}


	/**
	 * Capture a valid last name
	 */
	private String getLastName() {
		String enterName = "";
		String returnName = "";

		scanner.nextLine();
		System.out.print("\n-- Enter last name or X to exit : ");

		//Loop to make sure you capture a last name

		return returnName;
	}

	/**
	 * Use case 2: 
	 * Print the contact list. The system prints all 
	 * information about all contacts to the console, 
	 * sorted by last name.
	 */
	private void useCase2() {
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t List of all contacts");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(contactList.toString());
	}


	/**
	 * Use case 3: 
	 * Retrieve a person's information by last name
	 * The user enters a last name, and the system displays all of 
	 * the information that was previously entered on that person.
	 * 1)	If there is no one in the contact list with the given 
	 * 		last name, the system will display a message to the 
	 * 		user telling her that.
	 * 2)	If there is more than one person in the contact list with 
	 * 		the given last name, then all of the people with that last 
	 * 		name will be displayed.
	 */
	private void useCase3() {
		System.out.println("Get info by last name");	
	}

	/**
	 * Use case 4: 
	 * Retrieve a person's information by email address
	 * The user has chosen to retrieve a person's information from the 
	 * contact list by email address. The user enters an email address, 
	 * and the system displays all of the information that was previously 
	 * entered on the person with that email address.
	 * 	1)	If there is no one in the contact list with the given email address, 
	 * 		the system will display a message to the user telling her that.
	 * 	2)	If there is more than one person in the contact list with the given email  
	 * 		address, then all of the people with that email address will be displayed.
	 */
	private void useCase4() {
		System.out.println("Get info by email address");	
	}

	/**
	 * Use case 5: 
	 * Retrieve all people who live in a given zip code
	 * The user has chosen to retrieve all people from the contact 
	 * list who live in a given zip code. The user enters a zip code, 
	 * and the system displays all of the information on anyone in the 
	 * contact list with that zip code.
	 * 	1)	If there is no one in the contact list with the given zip code, 
	 * 		the system will display a message to the user telling her that.
	 * 	2)	If there is more than one person in the contact list with the given 
	 * 		zip code, then all of the people with that zip code will be displayed.
	 */
	private void useCase5() {
		System.out.println("Get email by zip code");	
	}

	/**
	 * Dump the contest to disk before exit
	 */
	private void writeListToFile() {
		System.out.println("Dumping contact list to disk");
		contactList.saveToDisk();
		System.out.println("Done");
	}
}

