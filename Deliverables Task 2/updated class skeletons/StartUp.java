/**
 * Program: StartUp
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
 * Description: This stub program launches the application main UI which  
 * to allow multiple instance of the application to run parallelly
 */

public class StartUp {
	
	public static void main(String args[]) {
		// Launch the main UI
		ContactListUI contactListUI = new ContactListUI();
		contactListUI.Show();
	}
}

/* ----------- Paste of run from console --------------

************************************************
Main Menu:
************************************************
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
************************************************
Select menu: 1
-------------------------------------------------
Enter contact details
-------------------------------------------------
	 First mame: 
	 Last name: 
	 Street address: 
	 Zip code: 
	 Email address: 
	 Phone number: 
	 Added notes: 
************************************************
Main Menu:
************************************************
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
************************************************
Select menu: 2

++++++++++++++++++++++++++++++++++++++++++++++++
	 List of all contacts
++++++++++++++++++++++++++++++++++++++++++++++++

************************************************
Main Menu:
************************************************
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
************************************************
Select menu: 3
Get info by last name
************************************************
Main Menu:
************************************************
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
************************************************
Select menu: 4
Get info by email address
************************************************
Main Menu:
************************************************
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
************************************************
Select menu: 5
Get email by zip code
************************************************
Main Menu:
************************************************
1. Add a new contact
2. Print the contact list
3. Get contact information by last name
4. Get contact information by email address
5. Get contact information by zip code
************************************************
Select menu: 

--------------------------------------------------- */