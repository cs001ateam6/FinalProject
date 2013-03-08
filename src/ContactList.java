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

	/**
	 * Anaga: First create an arrayList where contacts can be stored members of
	 * this array will be composed of various Contacts
	 */
	/*----------------------------------------------------
	 * Constructors 
	----------------------------------------------------*/
	List<Contact> contactList = new ArrayList<Contact>();

	/**
	 * Anaga: This is the constructor which will initialize the size of the
	 * arrayList (contact database)
	 */
	public ContactList() {
		System.out.println("You have initialized your contact list");
	}

	/*----------------------------------------------------
	 * Methods to build database array
	---------------------------------------------------- */

	/**
	 * Elena: This method will add a new Contact to the ContactList. Contact
	 * must have a last name to be added.
	 */
	public void addContact(String lastName, String firstName, String streetAddress, 
			String emailAddress, String phoneNumber,String addedNotes) {
		Contact addedContact = new Contact();
		contactList.add(addedContact);
		addedContact.setLastName(lastName);
		addedContact.setFirstName(firstName);
		addedContact.setStreetAddress(streetAddress);
		addedContact.setEmailAddress(emailAddress);
		addedContact.setPhoneNumber(phoneNumber);
		addedContact.addNotes(addedNotes);
		System.out.println("Index of this contact is: "
				+ contactList.indexOf(addedContact));
	}

	/**
	 * Elena: This method will return the entire contact list as a string.
	 */
	public String printContactList() {
		System.out
				.println("You have called printContactList() and your list will be printed shortly");
		return "The contact list has been printed";
	}

	/**
	 * Elena: This method will save the contact list as it has been entered
	 * during the current session to disk.
	 */
	public void saveToDisk() {
		System.out.println("Your contact list has been saved to disk.");
	}

	/*----------------------------------------------------
	 * Retrieval methods
	----------------------------------------------------*/
	/**
	 * Elena: This method will find contacts by allowing a user to search by a
	 * type and a keyword. For example, to search for a contact by e-mail, a
	 * user must first choose a type: email address, and then input the e-mail
	 * address itself.
	 * 
	 */
	public void searchContactList(Integer type, String searchString) {
		System.out.println("You have called searchContactList()");
	}

	public Contact getByIndex(int index) {
		return contactList.get(index);
	}
}
