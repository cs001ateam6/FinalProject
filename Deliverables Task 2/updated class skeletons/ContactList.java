/**
 * Program: ContactList
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
 * Description : This program stores a Contact List in an arrayList of type Contact. It allows you to search
 * for a contact by last name, e-mail address, and zip code; it allows you to print the entire contact list;
 * and it allows you to save the Contact List to disk.
 *
 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ContactList {
	
	//--------------------------  CLASS VARIABLES -------------------------- 

	// Added the word private as advised by professor
	private List<Contact> contactList = new ArrayList<Contact>();
	private final String DATA_FILE = "data.ser";

	//---------------------------- CONSTRUCTORS --------------------------- 

	/**
	 * Default constructor
	 */
	public ContactList() {
		// Load data from disk file
		readFromDisk();
	}
		
//-------------------------- PUBLIC METHODS --------------------------- 
	
	/**
	 * This method will add a new Contact to the ContactList. 
	 * Contact must have a last name to be added.
	 */
	public void addContact( //Parameters on next line for clarity
			String lastName, String firstName, String streetAddress, String emailAddress, String phoneNumber, String addedNotes
	){
		int contactIndex;
		Contact contactPassed = new Contact();
		contactPassed.setLastName(lastName);
		contactPassed.setFirstName(firstName);
		contactPassed.setStreetAddress(streetAddress);
		contactPassed.setEmailAddress(emailAddress);
		contactPassed.setPhoneNumber(phoneNumber);
		contactPassed.addNotes(addedNotes);
		// Check if the contact already exists
		contactIndex = getIndex(lastName);
		
		if (contactIndex >= 0){
			//Update existing contact
			contactList.set(contactIndex, contactPassed);
		}else {
			//Add new contact
			contactList.add( contactPassed );
		}
	}

	/**
	 * This method will save contact list to a disk file
	 */
	public void saveToDisk() {
		System.out.println("Your contact list has been saved to disk.");
		//We have code for this but it is not included in the class skeleton
	}

	//Get methods
	
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
	 * This method will return the entire contact list as a string, sorted by last name.
	 */
	public String toString() {
		
		StringBuilder returnString = new StringBuilder();
		Iterator<Contact> it=contactList.iterator();
		
		//Build a list of all contacts 
		while(it.hasNext())
        {
          Contact contact =it.next();
          returnString.append(contact.toString() + "\n");
        }
		//Sort the list
		return returnString.toString(); 
	}

	//-------------------------- PRIVATE METHODS --------------------------- 

	/**
	 * Add a Contact using contact object to the ContactList. 
	 */
	private void addContact(Contact contact) {
		contactList.add(contact);
	}

	/**
	 * This method will read contacts from disk file
	 */
	private void readFromDisk() {
		//Local Variables
		FileInputStream inFile;
		ObjectInputStream inObject;

		//Save file
		//if error, print error message.
	}
	//So since ContactList is serializable, do we still need Contact to be serializable? -Elena
	//We just need the Contacts class to be serialized as that class is being written to disk - Satyen
	//Got it -Elena

	/**
	 * Satyen: Checks if a contact exists using last name
	 * Return either index or -1
	 */
	private int getIndex(String lastName) {
		int returnIndex = -1;
		int runningIndex = 0;
		boolean contactFound = false;
		String contactLastName = new String();
		Iterator<Contact> it=contactList.iterator();

		//Iterate through the list to find contact by last name
		return returnIndex;
	}
}
