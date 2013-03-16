/*
 * Program: TestUseCase1
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
 * Description : This program tests Use Case 1 by adding 2 contacts, then showing the UI.
 * 
 * The program should be executed twice by the user, and the contact list printed both times, to check for correct serialization.
 */

public class TestUseCase1 {

	public static void main(String args[]) {

		// Create a new Contact List
		ContactList contactList = new ContactList();

		System.out.println();

		// Add a new contact
		contactList.addContact("Jacobson", "Ryan",
				"345 Padalecki Lane Los Altos CA", "94040", "ryan345@startup.com",
				"6505556666", "this is a sample contact");
		System.out.println();

		// Add another contact
		contactList.addContact("Addison", "Matt",
				"987 Ackles Avenue Los Altos CA", "88888",
				"matthew_rocks@startup.com", "6509884566",
				"this is a sample contact");
		
		System.out.println();

		// Save to disk
		contactList.saveToDisk();
		System.out.println();
		
		// Test the contact list UI
		ContactListUI contactListUI = new ContactListUI();
		
		// Add a contact via UI. 
		contactListUI.useCase1();
		
		// Add another via UI
		contactListUI.useCase1();
		
		// Print list. This uses Use Case 2, which has not been completed yet; note this list will not be in alphabetical order
		contactListUI.useCase2();
		
		//Save
		contactListUI.writeListToFile();		
	}
}

/* ----------------- PASTE OF FIRST RUN ------------------

Error reading from the file: data.ser (No such file or directory)

You have initialized all of this contact's variables
Contact's last name has been set
Contact's first name has been set
Contact's address has been set
Contact's email address has been set
Contact's phone # has been set
Contact's additional notes have been set

You have initialized all of this contact's variables
Contact's last name has been set
Contact's first name has been set
Contact's address has been set
Contact's email address has been set
Contact's phone # has been set
Contact's additional notes have been set



-------------------------------------------------
Enter contact details
-------------------------------------------------

-- Enter last name or X to exit : Hiddleston
-- First name: Thomas
-- Street address: 278 Angoran Ave.
-- Zip code: 28999
-- Email address: hiddles@axyz.com
-- Phone number: 178-333-2988
-- Added notes: test contact
You have initialized all of this contact's variables
Contact's last name has been set
Contact's first name has been set
Contact's address has been set
Contact's email address has been set
Contact's phone # has been set
Contact's additional notes have been set

-------------------------------------------------
Enter contact details
-------------------------------------------------

-- Enter last name or X to exit : Penderman
-- First name: Jules
-- Street address: 1888 Space Park Drive
-- Zip code: 83333
-- Email address: jules@spacepark.com
-- Phone number: 277-309-2094
-- Added notes: test contact
You have initialized all of this contact's variables
Contact's last name has been set
Contact's first name has been set
Contact's address has been set
Contact's email address has been set
Contact's phone # has been set
Contact's additional notes have been set

++++++++++++++++++++++++++++++++++++++++++++++++
	 List of all contacts
++++++++++++++++++++++++++++++++++++++++++++++++
Contact Details: Ryan Jacobson, 345 Padalecki Lane Los Altos CA, 94040, ryan345@startup.com, 6505556666, Note: this is a sample contact
Contact Details: Matt Addison, 987 Ackles Avenue Los Altos CA, 88888, matthew_rocks@startup.com, 6509884566, Note: this is a sample contact
Contact Details: Thomas Hiddleston, 278 Angoran Ave., 28999, hiddles@axyz.com, 178-333-2988, Note: test contact
Contact Details: Jules Penderman, 1888 Space Park Drive, 83333, jules@spacepark.com, 277-309-2094, Note: test contact

Dumping contact list to disk
Done

---------------------------------------------------------- */

