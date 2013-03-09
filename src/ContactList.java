/**
 * Program: ContactList
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
 * Description : This program stores a Contact List in an arrayList of type Contact. It allows you to search
 * for a contact by last name, e-mail address, and zip code; it allows you to print the entire contact list;
 * and it allows you to save the Contact List to disk.
 *
 */
import java.util.*;

public class ContactList {
	
	//Variables
	List<Contact> contactList = new ArrayList<Contact>();

	/*----------------------------------------------------
	 * Constructor
	----------------------------------------------------*/
	/**
	 * Anaga: This is the constructor which will initialize the size of the arrayList (contact database)
	 */
	public ContactList() {
		System.out.println("You have initialized your contact list");
	}
		
	/*----------------------------------------------------
	 * Methods to build database array
	---------------------------------------------------- */
	
	/**
	 * Elena: This method will add a new Contact to the ContactList. 
	 * Contact must have a last name to be added.
	 */
	public void addContact( //Parameters on next line for clarity
			String lastName, String firstName, String streetAddress, String emailAddress, String phoneNumber, String addedNotes
	){
		Contact addedContact = new Contact();
		contactList.add( addedContact );
		addedContact.setLastName(lastName);
		addedContact.setFirstName(firstName);
		addedContact.setStreetAddress(streetAddress);
		addedContact.setEmailAddress(emailAddress);
		addedContact.setPhoneNumber(phoneNumber);
		addedContact.addNotes(addedNotes);
		// Prints index of the contact for testing purposes
		System.out.println("Index of this contact is: " + contactList.indexOf(addedContact));
	}

	/**
	 * Elena: This method will save the contact list as it has been entered during the
	 * current session to disk.
	 */
	public void saveToDisk() {
		System.out.println("Your contact list has been saved to disk.");
	}
	
	/*----------------------------------------------------
	 * Retrieval methods
	----------------------------------------------------*/
	
	/**
	 * Elena: This method finds contacts by allowing a user to search by a type and a keyword.
	 * A user can only search by last name, e-mail address, or zip code, which is determined by an integer as follows:
	 * 1 searches by last name
	 * 2 searches by e-mail address
	 * 3 searches by zip code
	 * For example, to search for a contact by e-mail, a user must first choose type: 1 (for type e-mail address),
	 * and then input the e-mail address itself.
	 * 
	 * It uses a switch statement to determine what it's going to search by, and then a loop to search the contact list by index.
	 * 
	 * It will return a contact's information.
	 */
	public String searchBy(int type, String keyword){
		//switch statement
		//loop
		return "You have called searchBy()";
	}
	
	/**
	 * Elena: This method returns a contact by index. 
	 * It takes an int index and returns an object of class Contact, to which you can then pass methods.
	 * This is useful for loops.
	 */
	public Contact getByIndex(int index){
		return contactList.get(index);
	}
	
	/**
	 * Elena: This method will return the entire contact list as a string, sorted by last name.
	 */
	public String printContactList() {
		System.out.println("You have called printContactList() and your list will be printed shortly");
		//Sort the list
		return "The contact list has been printed";
	}
	
}
