/**
 * Program: Contact
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
 * Description : This program stores contact information
 * An instance of this class stores the information for one contact
 *
 */

import java.io.Serializable;

/**
 * Implement Serialization so we can write to disk
 */

public class Contact implements Serializable {

	private String firstName;
	private String lastName;
	private String streetAddress;
	private String zipCode;
	private String emailAddress;
	private String phoneNumber;
	private String addedNotes;

	/*----------------------------------------------------
	 * Constructors
	----------------------------------------------------*/

	/**
	 * Default constructor 
	 */
	public Contact() {
		firstName = " ";
		lastName = " ";
		streetAddress = " ";
		zipCode = " ";
		emailAddress = " ";
		phoneNumber = " ";
		addedNotes = " ";
		System.out.println("You have initialized all of this contact's variables");
	}
	//So this will allow the class to be initialized either as an empty contact or a full contact. -Elena
	//What happens if certain values are missing? -Elena
	//Just pass the ones you have and the rest can be blank - Satyen

	/**
	 * Constructor that takes all contact details
	 */
	public Contact( 
		String firstNameP, String lastNameP, String streetAddressP, String zipCodeP, 
		String emailAddressP, String phoneNumberP, String addedNotesP){
		
		firstName = firstNameP;
		lastName = lastNameP;
		streetAddress = streetAddressP;
		zipCode = zipCodeP; 
		emailAddress = emailAddressP ;
		phoneNumber = phoneNumberP;
		addedNotes = addedNotesP;
	}
	//I like the edited String names here, much clearer this way -Elena
	

	/*----------------------------------------------------
	 * Properties
	----------------------------------------------------*/

	/**
	 * Elena: This method sets the contact's firstName to fName, the string
	 * passed to this method.
	 */
	public void setFirstName(String fName) {
		firstName = fName;
		System.out.println("Contact's first name has been set");
	}

	/**
	 * Elena: This method sets the contact's lastName to lName, the string
	 * passed to this method.
	 */
	public void setLastName(String lName) {
		lastName = lName;
		System.out.println("Contact's last name has been set");
	}

	/**
	 * Elena: This method sets the contact's streetAddress to stAddress, the
	 * string passed to this method.
	 * 
	 * It also sets zipCode to the last 5 characters of stAddress.
	 */
	public void setStreetAddress(String stAddress) {
		streetAddress = stAddress;
		System.out.println("Contact's address has been set");
	}

	/**
	 * Elena: This method sets the contact's emailAddress to eAddress, the
	 * string passed to this method.
	 */
	public void setEmailAddress(String eAddress) {
		emailAddress = eAddress;
		System.out.println("Contact's email address has been set");
	}

	/**
	 * Elena: This method sets the contact's phoneNumber to phnNumber, the
	 * string passed to this method.
	 */
	public void setPhoneNumber(String phnNumber) {
		phoneNumber = phnNumber;
		System.out.println("Contact's phone # has been set");
	}

	/**
	 * Elena: This method lets the user add notes to the contact by setting
	 * addedNotes to the string notes, passed to this method.
	 */
	public void addNotes(String notes) {
		addedNotes = notes;
		System.out.println("Contact's additional notes have been set");
	}

	/**
	 * Anaga: This method returns the contact and its attributes in a string
	 */
	//Renamed this method from getContactInfo to toString as advised by professor 
	public String toString() {
		String contact_string = "Contact Details: " + firstName + " " + lastName + 
				", " + streetAddress + ", " + emailAddress + ", " + phoneNumber + ", " + 
				"Note: " + addedNotes;
		return contact_string;
	}

	/*----------------------------------------------------
	 * Validation methods: these will be PRIVATE and be called when calling set methods
	----------------------------------------------------*/

	/**
	 * Satyen: This method validates the contact name
	 */
	public boolean isNameValid() {
		System.out.println("You have called isNameValid()");
		return true;
	}

	/**
	 * Satyen: This method validates the email address
	 */
	public boolean isEmailValid() {
		System.out.println("You have called isEmailValid()");
		return true;
	}

}
