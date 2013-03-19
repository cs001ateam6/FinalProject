/**
 * Program: Contact
 *
 * Author: Team 6
 * Written: Mar 15, 2013
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

	//--------------------------  CLASS VARIABLES -------------------------- 

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String zipCode;
	private String emailAddress;
	private String phoneNumber;
	private String setNotes;

	//---------------------------- CONSTRUCTORS --------------------------- 

	/**
	 * Default constructor 
	 */
	public Contact() {
		firstName = "";
		lastName = "";
		streetAddress = "";
		zipCode = "";
		emailAddress = "";
		phoneNumber = "";
		setNotes = "";
		System.out.println("You have initialized all of this contact's variables");
	}

	/**
	 * Constructor that takes all contact details
	 */
	public Contact( 
		String firstNameP, String lastNameP, String streetAddressP, String zipCodeP, 
		String emailAddressP, String phoneNumberP, String setNotesP){
		
		firstName = firstNameP;
		lastName = lastNameP;
		streetAddress = streetAddressP;
		zipCode = zipCodeP; 
		emailAddress = emailAddressP ;
		phoneNumber = phoneNumberP;
		setNotes = setNotesP;
	}
	
	//---------------------------PUBLIC METHODS --------------------------- 
	
	/**
	 * Elena: This method sets the contact's firstName to fName, the string
	 * passed to this method.
	 */
	public void setFirstName(String fName) {
		firstName = fName;
		System.out.println("Contact's first name has been set");
	}

	/**
	 * Anaga: This method gets a contact's first name and returns it as a String.
	 */
	public String getFirstName() {
		return firstName;
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
	 * Satyen: This method gets the contact's lastName 
	 */
	public String getLastName() {
		return lastName;
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
	 * Elena: this method returns the contact's Street Address as a String
	 */
	public String getStreetAddress () {
		return streetAddress;
	}

	/**
	 *Anaga: This method sets the zip code.
	 */
	public void setZipCode(String zpCode) {
		zipCode = zpCode;
	}

	/**
	 *Anaga: This method gets the zip code and returns it as a String.
	 */
	public String getZipCode() {
		return zipCode;
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
	 * This method returns a contact's email address as a String
	 */
	public String getEmailAddress() {
		return emailAddress;
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
	 *Anaga: this method returns a contact's phone number as a String
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Elena: This method lets the user add notes to the contact by setting
	 * setNotes to the string notes, passed to this method.
	 */
	public void setNotes(String notes) {
		setNotes = notes;
		System.out.println("Contact's additional notes have been set");
	}

	/**
	 *Anaga: this method gets a Contact's Notes and returns them as a String.
	 */
	public String getNotes() {
		return setNotes;
	}

	/**
	 * Anaga: This method returns the contact and its attributes in a string
	 */
	//Renamed this method from getContactInfo to toString as advised by professor 
	public String toString() {
		String contact_string = "Contact Details: " + firstName + " " + lastName + 
				", " + streetAddress + ", " + zipCode + ", " + emailAddress + ", " + phoneNumber + ", " + 
				"Note: " + setNotes;
		return contact_string;
	}
	

	//------------------------ PRIVATE METHODS --------------------------- 

	/**
	 * Satyen: This method validates the contact name
	 */
	private boolean isNameValid() {
		System.out.println("You have called isNameValid()");
		return true;
	}

	/**
	 * Satyen: This method validates the email address
	 */
	private boolean isEmailValid() {
		System.out.println("You have called isEmailValid()");
		return true;
	}

}
