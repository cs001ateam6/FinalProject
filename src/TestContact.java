/**
 * Program: TestContact
 *
 * Author: Team 6
 * Written: Mar 07, 2013
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
		Contact contact = new Contact();
		
		//Set values
		contact.setFirstName("John");
		contact.setLastName("Smith");
		contact.setStreetAddress("123 Jensen Avenue, Mountain View, CA 94040");
		contact.setPhoneNumber("408-454-8888");
		contact.setEmailAddress("johnsmith@startup.com");
		contact.addNotes("This is a sample contact.");
		
		//Test if values are valid. These methods will actually be private to class Contact
		// Satyen: This methods should be private and hence we need not test them
		//contact.isNameValid();
		//contact.isEmailValid();
	
		//Get contact's info
		System.out.println();
		System.out.println(contact.toString());
	}
}

/*--------------------- PASTE OF RUN FROM CONSOLE --------------------------

You have initialized all of this contact's variables
Contact's first name has been set
Contact's last name has been set
Contact's address has been set
Contact's phone # has been set
Contact's email address has been set
Contact's additional notes have been set
You have called isNameValid()
You have called isEmailValid()

Contact Details:
John Smith
123 Jensen Avenue, Mountain View, CA 94040
johnsmith@startup.com
408-454-8888
Note: This is a sample contact.

-----------------------------------------------------------------------------*/