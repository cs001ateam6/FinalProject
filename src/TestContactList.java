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

/*--------------------- PASTE OF RUN FROM CONSOLE --------------------------

You have initialized your contact list

You have initialized all of this contact's variables
Contact's last name has been set
Contact's first name has been set
Contact's address has been set
Contact's email address has been set
Contact's phone # has been set
Contact's additional notes have been set
Index of this contact is: 0
Contact Details:
Ryan Jacobson
345 Padalecki Lane Los Altos CA 88888
ryan345@startup.com
6505556666
Note: this is a sample contact

You have initialized all of this contact's variables
Contact's last name has been set
Contact's first name has been set
Contact's address has been set
Contact's email address has been set
Contact's phone # has been set
Contact's additional notes have been set
Index of this contact is: 1
Contact Details:
Matt Addison
987 Ackles Avenue Los Altos CA 88888
matthew_rocks@startup.com
6509884566
Note: this is a sample contact

Your contact list has been saved to disk.

Here is the main menu. It will be called by the UI
Main Menu. Type the corresponding number: 
1 to find a contact
2 to print the whole list, sorted by last name
3 to add a new contact

What would you like to search by? Type the corresponding number:
1 to search by last name
2 to search by e-mail address
3 to search by zip code
Type the keyword you want to search for.

This test program will now pass '1' and 'Jacobson' to searchBy()
You have called searchBy()

You have called printContactList() and your list will be printed shortly
The contact list has been printed


-----------------------------------------------------------------------------*/
