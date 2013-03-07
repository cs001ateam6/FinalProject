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

public class Contact {

	private String firstName;
	private String lastName;
	private String streetAddress;
	private String zipCode;
	private String emailAddress;
	private String phoneNumber;
	private String addedNotes;

	/**
	 * This method is the constructor. It initializes all of this class's private variables to a space,
	 * so that if one of them is not set and the contact is printed, it will not show.
	 */
	public Contact(){
		System.out.println("You have initialized all of this contact's variables");
	}

	/**
	 * This method sets the contact's firstName to fName, the string passed
	 * to this method. 
	 */
	public void setFirstName(String fName){
		System.out.println("You have called setFirstName() and set the contact's first name");
	}

	/**
	 * This method sets the contact's lastName to lName, the string passed 
	 * to this method.
	 */
	public void setLastName(String lName){
		System.out.println("You have called setLastName() and set the contact's last name");
	}

	/**
	 * This method sets the contact's streetAddress to stAddress, the
	 * string passed to this method.
	 *
	 * It also sets zipCode to the last 5 characters of stAddress.
	 */
	public void setStreetAddress(String stAddress){
		System.out.println("You have called setStreetAddress");
	}

	/**
	 * This method sets the contact's emailAddress to eAddress, the 
	 * string passed to this method.
	 */
	public void setEmailAddress(String eAddress){
		System.out.println("You have called setEmailAddress");
	}

	/**
	 * This method sets the contact's phoneNumber to phnNumber, the 
	 * string passed to this method.
	 */
	public void setPhoneNumber(String phnNumber){
		System.out.println("You have called setPhoneNumber");
	}

	/**
	 * This method lets the user add notes to the contact by
	 * setting addedNotes to the string notes, passed to this method.
	 */
	public void addNotes(String notes){
		System.out.println("You have called addNotes()");
	}

	/**
	 * This method prints the contact's information in a formatted String.
	 * It returns a String.
	 */
	public String toString(){
		System.out.println("You have called toString()");
		return "You have printed the contact information to String";
	}

}