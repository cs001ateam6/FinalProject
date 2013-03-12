/**
 * Program: TestContact
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
 * Description : This program tests all the methods in class Contact.
 *
 */

public class TestContact {
	public static void main(String args[]) {
		
		//Create new contact
		Contact test;
		test = new Contact();
		
		//Set values
		test.setFirstName("John");
		test.setLastName("Smith");
		test.setStreetAddress("123 Jensen Avenue, Mountain View, CA 94040");
		test.setPhoneNumber("408-454-8888");
		test.setEmailAddress("johnsmith@startup.com");
		test.addNotes("This is a sample contact.");
		
		//Test if values are valid. These methods will actually be private to class Contact
		// Satyen: This methods should be private and hence we need not test them
		//contact.isNameValid();
		//contact.isEmailValid();
	
		//Get contact's info
		System.out.println();
		System.out.println(test.toString());
	}
}

/* ---------- Paste of run from console -----------
 
You have initialized all of this contact's variables
Contact's first name has been set
Contact's last name has been set
Contact's address has been set
Contact's phone # has been set
Contact's email address has been set
Contact's additional notes have been set

Contact Details:
John Smith
123 Jensen Avenue, Mountain View, CA 94040
johnsmith@startup.com
408-454-8888
Note: This is a sample contact.
 
--------------------------------------------------- */

