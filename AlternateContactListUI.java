/**
 * This class is an alternate user interface for the Contact List.
 *
 * It relies on a main menu that returns every time a use case is completed.
 * This main menu is created by method mainMenu() that must be called from ContactList.java.
 */

class AlternateContactListUI {
	
	public static void main(String[] args) {

		//load the contact list from disk
			
		System.out.println("Welcome to your contact list!");
		contactList.mainMenu();

	}
}