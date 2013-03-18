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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ContactList {
	

	//--------------------------  INSTANCE VARIABLES -------------------------- 

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
			String lastName, String firstName, String streetAddress, String zipCode, String emailAddress, String phoneNumber, String addedNotes
	){
		int contactIndex;
		Contact contactPassed = new Contact();
		contactPassed.setLastName(lastName);
		contactPassed.setFirstName(firstName);
		contactPassed.setStreetAddress(streetAddress);
		contactPassed.setZipCode(zipCode);
		contactPassed.setEmailAddress(emailAddress);
		contactPassed.setPhoneNumber(phoneNumber);
		contactPassed.addNotes(addedNotes);
		// Check if the contact already exists
		contactIndex = getIndex(firstName, lastName);
		
		// The way this is designed right now, I cannot add multiple contacts with the same last name. -Elena
		// The first one gets replaced by the second
		// Satyen: Modified the getIndex method to look for both first and last name 
		
		if (contactIndex >= 0){
			//Update existing contact
			contactList.set(contactIndex, contactPassed);
		}else {
			//Add new contact
			contactList.add( contactPassed );
		}	
	}

	/**
	 * Add a Contact using contact object to the ContactList. 
	 * Made this method public as adviced by Mr. John
	 */
	public void addContact(Contact contact) {
		contactList.add(contact);
	}
	
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
		
		// Make a copy of the contact list, to keep the original intact 
		List<Contact> sortedContactList = cloneContactList();
		// Sort the cloned list
		Collections.sort(sortedContactList, new ContactCompare());
		// Iterate through the sorted list
		Iterator<Contact> it=sortedContactList.iterator();
		
		//Build a list of all contacts 
		while(it.hasNext())
        {
          Contact contact =it.next();
          returnString.append(contact.toString() + "\n");
        }
		//Sort the list
		return returnString.toString(); 
	}

	/**
	 * Anaga: This method searches contact by a given type. 
	 * It returns contact string
	 * Type: 1 = Last name
	 * 		 2 = email address
	 * 		 3 = zip code
	 */
	public String searchContacts(Integer type,  String searchStringPassed) {
		//Satyen: Every method should have only one exit and we have two returns here
		Boolean contactFound = false; 
		StringBuilder returnString = new StringBuilder();
		Contact contact;
		String searchString = "";
		String messageString = "";

		for(int i = 0; i < contactList.size(); i++) {
			contact = (Contact) getByIndex(i);
			// Set the string to search based on type
			switch (type) {
				case 1:  
					searchString = contact.getLastName();
					messageString = "last name";
                    break;
				case 2:  
					searchString = contact.getEmailAddress();
					messageString = "email address";
					break;
				default: 
					searchString = contact.getZipCode();
					messageString = "zip code";
					break;
			}
			
			if (searchStringPassed.equalsIgnoreCase(searchString)){
				contactFound = true;
				returnString.append("\n" + contact.toString());
			}
		}

		// Return not found message
		if (contactFound == false) {
			returnString.append("Unable to locate contacts for the " + messageString + " " + searchStringPassed);
		}
		return returnString.toString();
	}

	
	//-------------------------- PRIVATE METHODS --------------------------- 

	/**
	 * This method will read contacts from disk file
	 */
	private void readFromDisk() {
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
	//Got it -Elena

	/**
	 * Checks if a contact exists using first and last name
	 * Return either index or -1
	 */
	private int getIndex(String firstName, String lastName) {
		int returnIndex = -1;
		int runningIndex = 0;
		boolean contactFound = false;
		Iterator<Contact> it=contactList.iterator();

		// Iterate through the list to find the contact by last name
		while(it.hasNext() && contactFound == false)
        {
          Contact contact =it.next();
          
          // Check if the first name and last name are same
          if (contact.getLastName().equalsIgnoreCase(lastName) &&
        	  contact.getFirstName().equalsIgnoreCase(firstName)){
        	  contactFound = true;
        	  returnIndex = runningIndex; 
          }
          runningIndex ++;
        }
		
		return returnIndex;
	}

	/**
	 * Satyen: Clone a contact list 
	 * @return
	 */
	private List<Contact> cloneContactList() {
		List<Contact> clone = new ArrayList<Contact>(contactList.size());
	    for(Contact item: contactList){ 
	    	clone.add(item);
	    }
	    return clone;
	}

}
