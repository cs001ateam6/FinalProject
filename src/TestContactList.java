/*
 * Program: TestContactList
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
 * Description : This test program performs various use 
 * 			    cases on ContactList class 
 */

public class TestContactList {
	public static void main(String args[]) {

		// Create a new Contact List
		ContactList contactList = new ContactList();

		System.out.println();

		// Add a new contact to it and fetch it by its position in the contact list
		contactList.addContact("Jacobson", "Ryan",
				"345 Padalecki Lane Los Altos CA 88888", "ryan345@startup.com",
				"6505556666", "this is a sample contact");
		System.out.println(contactList.getByIndex(0).getContactInfo());
		System.out.println();

		// Add another contact and fetch it by its position in the contact list
		contactList.addContact("Addison", "Matt",
				"987 Ackles Avenue Los Altos CA 88888",
				"matthew_rocks@startup.com", "6509884566",
				"this is a sample contact");
		
		System.out.println(contactList.getByIndex(1).getContactInfo());
		System.out.println();

		// Save to disk
		contactList.saveToDisk();
		System.out.println();
		
		//Call the main menu
		System.out.println("Here is the main menu. It will be called by the UI");
		contactList.mainMenu();
		
		// Search for a contact
		contactList.findContact();
		System.out.println();
		
		// Call searchBy()
		// Usually findContact() will call searchBy()
		System.out.println("This test program will now pass '1' and 'Jacobson' to searchBy()");
		System.out.println(contactList.searchBy(1, "Jacobson"));
		System.out.println();
		
		// Print the contact list
		System.out.println(contactList.printContactList());
		System.out.println();	
	}
}

/*----------------------PASTE OF RUN FROM CONSOLE--------------------

Main Menu:
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
Select menu: 1
Add new contact
Main Menu:
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
Select menu: 
2
Print the contact list
Main Menu:
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
Select menu: 3
Get info by last name
Main Menu:
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
Select menu: 4
Get info by email address
Main Menu:
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
Select menu: 5
Get email by zip code
Main Menu:
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
Select menu: 

---------------------------------------------*/