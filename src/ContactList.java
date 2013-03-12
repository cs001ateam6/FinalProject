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
	
	// Added the word private as advised by professor

	//class variables
	private List<Contact> contactList = new ArrayList<Contact>();
	private final String DATA_FILE = "data.ser";

	/*----------------------------------------------------
	 * Constructor
	----------------------------------------------------*/

	/**
	 * Default constructor
	 */
	public ContactList() {
		// Load data from disk file
		readFromDisk();
	}
		
	/*----------------------------------------------------
	 * Methods to build database array
	---------------------------------------------------- */
	
	/**
	 * This constructor will add a new Contact to the ContactList. 
	 * Takes a contact objects as input 
	 */
	public void addContact(Contact contact) {
		contactList.add(contact);
	}

	/**
	 * This method will add a new Contact to the ContactList. 
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
	}

	/*----------------------------------------------------
	 * File handling Methods
	 *--------------------------------------------------- */
	
	/**
	 * This method will read contacts from disk file
	 */
	public void readFromDisk() {
		//Local variables
		FileInputStream inFile;
		ObjectInputStream inObject;
		
		try {
			inFile = new FileInputStream(DATA_FILE);
			inObject = new ObjectInputStream(inFile);
			Object obj = null;
			// Read data from file
        	//while ((contact=(Contact)inObject.readObject()) !=null){
            
            while ((obj = inObject.readObject()) != null) {
				addContact((Contact)obj);
			}
			inFile.close();
			inObject.close();
        } catch (EOFException ex) { //This exception will be caught when EOF is reached
	            // ignore the EOF error
		} catch (IOException ioe) {
			System.out.println("Error reading from the file: "
					+ ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to Rectangle: " + cnfe);
		}
	}
//So since ContactList is serializable, do we still need Contact to be serializable? -Elena
//We just need the Contacts class to be serialized as that class is being written to disk - Satyen
	
	/**
	 * This method will save contact list to a disk file
	 */
	public void saveToDisk() {
		//Local variables
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		Iterator<Contact> it=contactList.iterator();
		
		try {
			outFile = new FileOutputStream(DATA_FILE);
			outObject = new ObjectOutputStream(outFile);
			//Write object to a file 
			while(it.hasNext())
	        {
	          Contact contact =it.next();
	          outObject.writeObject(contact);
	        }
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: " + ioe.getMessage());
		}
	}

	/* ----------------------------------------------------
	 * Retrieval methods
	 * ----------------------------------------------------*/
	
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
	
}
