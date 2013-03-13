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
				"345 Padalecki Lane Los Altos CA", "94040", "ryan345@startup.com",
				"6505556666", "this is a sample contact");
		System.out.println(contactList.getByIndex(0).toString());
		System.out.println();

		// Add another contact and fetch it by its position in the contact list
		contactList.addContact("Addison", "Matt",
				"987 Ackles Avenue Los Altos CA", "88888",
				"matthew_rocks@startup.com", "6509884566",
				"this is a sample contact");
		
		System.out.println(contactList.getByIndex(1).toString());
		System.out.println();

		// Save to disk
		contactList.saveToDisk();
		System.out.println();
		
		// Call searchBy()
		// Usually findContact() will call searchBy()
		System.out.println("This test program will now pass '1' and 'Jacobson' to searchBy()");
		System.out.println(contactList.searchBy(1, "Jacobson"));
		System.out.println();
		
		// Print the contact list
		System.out.println(contactList.toString());
		System.out.println();	
	}
}

