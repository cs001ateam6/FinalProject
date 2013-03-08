/*
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

/* 
 * Implement Serialization so we can write to disk 
 */

public class Contact implements  Serializable   {

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
	 * Satyen: This constructor takes all contact values 
	 */
	public void Contact(String firstName, String lastName, String streetAddress, String zipCode,
			String emailAddress, String phoneNumber, String addedNotes) {
		System.out.println("You have initialized all of this contact's variables");
	}

	/*----------------------------------------------------
	 * Properties
	----------------------------------------------------*/

	
	/**
	 * Elena:
	 * This method sets the contact's firstName to fName, the string passed to
	 * this method.
	 */
	public void setFirstName(String fName) {
		System.out.println("user's first name");
	}

	/**
	 * Elena:
	 * This method sets the contact's lastName to lName, the string passed to
	 * this method.
	 */
	public void setLastName(String lName) {
		System.out.println("user's last name");
	}

	/**
	 * Elena:
	 * This method sets the contact's streetAddress to stAddress, the string
	 * passed to this method.
	 * 
	 * It also sets zipCode to the last 5 characters of stAddress.
	 */
	public void setStreetAddress(String stAddress) {
		System.out.println("user's address");
	}

	/**
	 * Elena:
	 * This method sets the contact's emailAddress to eAddress, the string
	 * passed to this method.
	 */
	public void setEmailAddress(String eAddress) {
		System.out.println("user's email");
	}

	/**
	 * Elena:
	 * This method sets the contact's phoneNumber to phnNumber, the string
	 * passed to this method.
	 */
	public void setPhoneNumber(String phnNumber) {
		System.out.println("user's phone #");
	}

	/**
	 * Elena:
	 * This method lets the user add notes to the contact by setting addedNotes
	 * to the string notes, passed to this method.
	 */
	public void addNotes(String notes) {
		System.out.println("user's additional notes");
	}
	
	/** 
	 * Anaga: This method returns the contact’s attributes in a string
	 */
	public String getContactInfo() {
		String contact_string = "Contact Details" + "\n" + firstName + "\n" +  lastName + "\n" + streetAddress + "\n" + zipCode
				+ "\n" + emailAddress + "\n" + phoneNumber + "\n" + addedNotes;
		return contact_string;
	}
		
	
	/*----------------------------------------------------
	 * Validation methods
	----------------------------------------------------*/

	/**
	 * Satyen:
	 * This method validates the contact name
	 */
	private boolean isNameValid() {
		System.out.println("You have called isNameValid()");
		return true;
	}

	/**
	 * Satyen:
	 * This method validates the email address
	 */
	private boolean isEmailValid() {
		System.out.println("You have called isEmailValid()");
		return true;
	}
}
