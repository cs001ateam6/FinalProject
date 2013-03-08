class ContactList {

/**
 * Anaga: First create an arrayList where contacts can be stored
 * members of this array will be composed of various Contacts
 */
	Contacts[] list; 
    list = new Contacts[MaxSize];    

	/*----------------------------------------------------
	 * Constructors 
	----------------------------------------------------*/
	
	/**
	 * Anaga: This is the constructor which will initialize the size of the arrayList (contact database)
	 */
	public ContactList() {
	System.out.println(" Here we initialize the size of the array");	
	}
		
	/*----------------------------------------------------
	 * Methods to build database array
	---------------------------------------------------- */
	
	
	/**
	 * Elena:
	 * This method will return the entire contact list as a string.
	 */
	public String printContactList() {
		return "The contact list has been printed";
	}

	/**
	 * Elena:
	 * This method will save the contact list as it has been entered during the
	 * current session to disk.
	 */
	
	public void saveToDisk() {
	}
	
	/*----------------------------------------------------
	 * Retrieval methods
	----------------------------------------------------*/
	/**
	 * Elena:
	 * This method will by their given last name.
	 * 
	 */
	public String getContactByLastName(String lname) {
		return "Here are the contact with that last name";
	}

	/**
	 * Elena:
	 * This method will return the contact with the given email address.
	 * 
	 */
	public String getContactByEmail(String email) {
		return "Here are the contacts with that email address";
	}

	/**
	 * Elena:
	 * This method will return all contacts with a given zip code.
	 * 
	 */
	public String getContactsByZip(String zip) {
		return "Here are the contacts with that zip code";
	}

}

/**
 * Tests the class skeleton for class Contact.
 *
 */
