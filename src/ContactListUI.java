/**
 * Program: ContactListUI
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
 * Description : This class is the user interface for the Contact List.
 * It will implement the use cases
 *
 */

import java.util.*;

/**
 * Satyen: Console based use to handle all use cases
 */
class ContactListUI {
	
	public static void main(String[] args) {
		
		//Define local variable 
		int menuSelected = 0;
		Scanner scanner = new Scanner(System.in);

		// perform the loop based on user inputep
		while (menuSelected > -1 && menuSelected < 6  )
		{
			//Display menu 	
			displayMenu();
			// Accept user choice
			menuSelected = scanner.nextInt();
			 
			switch (menuSelected){
			 	case 1: useCase1();
			 			break;
			 	case 2: useCase2();
			 			break;
			 	case 3: useCase3();
			 			break;
			 	case 4: useCase4();
	 					break;
			 	case 5: useCase5();
	 					break;
			}
		}
		scanner.close();
	}

	/**
	 * Satyen
	 * Display a menu for all use cases
	 */
	private static void displayMenu() {
		System.out.println("1. Perform user case 1");
		System.out.println("2. Perform user case 2");
		System.out.println("3. Perform user case 3");
		System.out.println("4. Perform user case 4");
		System.out.println("5. Perform user case 5");
		System.out.print("Select menu: ");
	}

	/**
	 * Satyen
	 * Use case 1: Enter a new person
	 */
	private static void useCase1() {
		System.out.println("Perform user case 1");
	}

	/**
	 * Satyen
	 * Use case 2: Print the contact list
	 */
	private static void useCase2() {
		System.out.println("Perform user case 2");
	}


	/**
	 * Satyen
	 * Use case 3: Retrieve a person's information by last name
	 */

	private static void useCase3() {
		System.out.println("Perform user case 3");	
	}

	/**
	 * Satyen
	 * 	Use case 4: Retrieve a person's information by email address
	 */
	private static void useCase4() {
		System.out.println("Perform user case 4");	
	}

	/**
	 * Satyen
	 * 	Use case 5: Retrieve all people who live in a given zip code
	 */
	private static void useCase5() {
		System.out.println("Perform user case 5");	
	}
}
