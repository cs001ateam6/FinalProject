/*
* Program: ContactList
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
* Description : This class maintains a contact list
* 	An instance of this class always refers 
* 	to an instance of a class Contact
*/

import java.util.*;

public class ContactList {

	private List<Contact> contactList = new ArrayList<Contact>();

	/**
	 * This is the constructor.
	 *
	 */
	public ContactList(){

	}

	/**
	 * This method adds a new instance of class Contact to the array contactList
	 * 
	 */
	public void addContact(){

	}

	/**
	 * This method will return the entire contact list as a string.
	 *
	 */
	public String printContactList(){
		return "The contact list has been printed";
	}

	/**
	 * This method will return all contacts with a given last name.
	 *
	 */
	public String getContactByLastName(String lname){
		return "Here are the contacts with that last name";
	}

	/**
	 * This method will return all contacts with a given email address.
	 *
	 */
	public String getContactByEmail(String email){
		return "Here are the contacts with that email address";
	}

	/**
	 * This method will return all contacts with a given zip code.
	 *
	 */
	public String getContactsByZip(String zip){
		return "Here are the contacts with that zip code";
	}

	/**
	 * This method will save the contact list as it has been entered during the current session to disk.
	 *
	 */
	public void saveToDisk(){

	}

}