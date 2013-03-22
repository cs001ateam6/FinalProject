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

	//--------------------------  INSTANCE VARIABLES -------------------------- 

	private static final long serialVersionUID = 1L;
	private String firstName = "";
	private String lastName = "";
	private String streetAddress = "";
	private String zipCode = "";
	private String emailAddress = "";
	private String phoneNumber = "";
	private String addedNotes = "";

	
	//---------------------------- CONSTRUCTORS --------------------------- 

	/**
	 * Elena: Default constructor 
	 */
	public Contact() {
	}

	/**
	 * Elena: Constructor that takes all contact details
	 * @param firstnameP		the contact's first name
	 * @param lastNameP 		the contact's last name
	 * @param streetAddressP 	the contact's street address
	 * @param zipCodeP 			the contact's zip code
	 * @param phoneNumberP 		the contact's phone number
	 * @param addedNotesP 		notes added to the contact
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
		addedNotes = addedNotesP; //renamed these variables more clearly - Satyen
	}
	
	
	//---------------------------PUBLIC METHODS --------------------------- 
	
	/**
	 * Elena: This method sets the contact's firstName.
	 * @param fName 	the String the contact's firstName will be set to
	 */
	public void setFirstName(String fName) {
		firstName = fName;
	}

	/**
	 * Anaga: This method gets and returns a contact's first name.
	 * @return firstName 	the contact's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Elena: This method sets the contact's lastName to lName, the string
	 * passed to this method.
	 * @param lName 	the string that a contact's last name iwll be set to
	 */
	public void setLastName(String lName) {
		lastName = lName;
	}

	/**
	 * Satyen: This method gets the contact's last name 
	 * @return lastName 	the contact's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Elena: This method sets the contact's streetAddress to stAddress, the
	 * string passed to this method.
	 * @param stAddress 	the String the contact's street address will be set to
	 */
	public void setStreetAddress(String stAddress) {
		streetAddress = stAddress;
	}

	/**
	 * Elena: this method returns the contact's Street Address as a String
	 * @return streetAddress 	the contact's street address
	 */
	public String getStreetAddress () {
		return streetAddress;
	}

	/**
	 *Anaga: This method sets the zip code.
	 *@param zpCode 	the String the contact's zip code will be set to
	 */
	public void setZipCode(String zpCode) {
		zipCode = zpCode;
	}

	/**
	 *Anaga: This method gets the zip code and returns it as a String.
	 *@return zipCode 	the contact's zip code
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Elena: This method sets the contact's emailAddress to eAddress, the
	 * string passed to this method.
	 *@param eAddress 	the String the contact's email address will be set to
	 */
	public void setEmailAddress(String eAddress) {
		emailAddress = eAddress;
	}

	/**
	 * Elena: This method returns a contact's email address as a String
	 * @return emailAddress 	the contact's email address
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Elena: This method sets the contact's phoneNumber to phnNumber, the
	 * string passed to this method.
	 * @param phnNumber 	the string the contact's phone number will be set to
	 */
	public void setPhoneNumber(String phnNumber) {
		phoneNumber = phnNumber;
	}

	/**
	 *Anaga: this method returns a contact's phone number as a String
	 *@return phoneNumber 	the contact's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Elena: This method lets the user add notes to the contact by setting
	 * addedNotes to the string notes, passed to this method.
	 * @param notes 	the notes that will be added to the contact
	 */
	public void setNotes(String notes) {
		addedNotes = notes;
	}

	/**
	 *Anaga: this method gets a Contact's Notes and returns them as a String.
	 *@return addedNotes 	the notes appended to the contact
	 */
	public String getNotes() {
		return addedNotes;
	}

	/**
	 * Anaga: This method returns the contact and its attributes in a string
	 * @return returnString 	the String containing the contact's information
	 */
	public String toString() {
		String returnString = String.format(
				"%1$-25s|%2$s",
				lastName.trim() + ", " + firstName.trim(),
				streetAddress + ", " + zipCode + ", " + emailAddress + 
				", " + phoneNumber + ", " + "Note: " + addedNotes);
		return returnString;
	}
}