/*
 * Program: TestUseCase1
 *
 * Author: Team 6
 * Written: Mar 19, 2013
 *
 * Course: CS 001A (Java) Winter 2013
 * Assignment: Final Project
 *
 * Compiler: Java 7.0
 * Platform: Windows 
 *
 * Description : This program tests Use Case 1 by adding 2 contacts and printing the contact list after each one.
 */

public class TestUseCase1 {

	public static void main(String args[]) {

		// Create a new Contact List
		ContactList contactList = new ContactList();
		
		// New contact list UI
		ContactListUI contactListUI = new ContactListUI();
		
		// Add a contact via UI. 
		contactListUI.newContact();

		// Print list. This uses Use Case 2, which has not been completed yet; note this list will not be in alphabetical order
		contactListUI.printContactList();
		
		// Add another via UI
		contactListUI.newContact();
		
		// Print list. This uses Use Case 2, which has not been completed yet; note this list will not be in alphabetical order
		contactListUI.printContactList();		
	}
}

/* ---------------- PASTE OF RUN FROM CONSOLE ------------------

Error reading from the file: data.ser (No such file or directory)
Error reading from the file: data.ser (No such file or directory)

-------------------------------------------------
Enter contact details
-------------------------------------------------

-- Enter last name or X to exit : Holmes
-- First name: Sherlock
-- Street address: 221B Baker St.
-- Zip code: 99999
-- Email address: sherlock@consult.com
-- Phone number: 234-234-2345
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
Contact Details: Sherlock Holmes, 221B Baker St., 99999, sherlock@consult.com, 234-234-2345, Note: test contact


-------------------------------------------------
Enter contact details
-------------------------------------------------

-- Enter last name or X to exit : Watson
-- First name: John
-- Street address: 123 Elsewhere Ave.
-- Zip code: 99999
-- Email address: john@doctorsunion.org
-- Phone number: 567-567-5678
-- Added notes: test contact 2
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
Contact Details: Sherlock Holmes, 221B Baker St., 99999, sherlock@consult.com, 234-234-2345, Note: test contact
Contact Details: John Watson, 123 Elsewhere Ave., 99999, john@doctorsunion.org, 567-567-5678, Note: test contact 2

------------------------ END RUN ------------------- */
