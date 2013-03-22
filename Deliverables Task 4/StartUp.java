/**
 * Program: StartUp
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
 * Description: This stub program launches the application main UI allows multiple instances of the application to run.
 */

public class StartUp {
	
	public static void main(String args[]) {
		
		// Launch the main UI
		ContactListUI contactListUI = new ContactListUI();
		
		//not necessary to create a ContactList object here as ContactListUI creates one for you - Elena
		
		// Load a previous contact list from disk, create a new one if none is available
		contactListUI.loadContactList();
		// Show the main menu
		contactListUI.Show();
		
	}
}

