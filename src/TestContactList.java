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


/**
 * This class will test the Contact List Class
 */


public class TestContactList {

	ContactList testlist = new ContactList;
	
//Anaga: This method will test to see whether the list can identify the contact by last name	
	testlist.getContactByLastName("LastName");
	//Anaga: This method will test to see whether the list can identify the contact by email address
	testlist.getContactByEmail("Email");

	// Anaga: This method will test to see whether the list can identify contacts in a given zipcode area
	testlist.getContactsByZip("Zip");

	//This method will test the program's ability to print the entire list by last name order
	testlist.printContactList();
	
	}

}