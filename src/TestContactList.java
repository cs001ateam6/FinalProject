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
		
		//Create a new Contact List
		ContactList test;
		test = new ContactList();
		
		System.out.println();
		
		//Add a new contact to it and fetch it by its position in the contact list
		test.addContact("Jacobson", "Ryan", "345 Padalecki Lane Los Altos CA 88888", "ryan345@startup.com", "6505556666", "this is a sample contact");
		System.out.println(test.getByIndex(0).getContactInfo());
		System.out.println();
		
		//Add another contact and fetch it by its position in the contact list
		test.addContact("Addison", "Matt", "987 Ackles Avenue Los Altos CA 88888", "matthew_rocks@startup.com", "6509884566", "this is a sample contact");
		System.out.println(test.getByIndex(1).getContactInfo());
		System.out.println();
		
		//Print the contact list
		System.out.println(test.printContactList());
		
		System.out.println();
		
		//Save to disk
		test.saveToDisk();
		
		System.out.println();
		
		//Search for a contact
		test.searchContactList("last name", "Jacobson");
	}
}