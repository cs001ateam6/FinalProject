/**
 * Tests the class skeleton for class Contact.
 *
 */

public class TestContact {
	public static void main(String args[]) {
		
		Contact test;
		test = new Contact();
		
		test.setFirstName("FIRSTNAME");
		test.setLastName("LASTNAME");
		test.setStreetAddress("STREETADDRESS");
		test.setPhoneNumber("### ### ####");
		test.setEmailAddress("xxx@yyy.com");
		test.addNotes("NOTES NOTES NOTES");
		test.toString();
		
		System.out.println(test.toString());
	}
}
