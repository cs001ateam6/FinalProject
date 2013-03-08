public class TestContact {
	public static void main(String args[]) {
		
		Contacts test;
		test = new Contacts();
		
		test.setFirstName("FIRSTNAME");
		test.setLastName("LASTNAME");
		test.setStreetAddress("STREETADDRESS");
		test.setPhoneNumber("### ### ####");
		test.setEmailAddress("xxx@yyy.com");
		test.addNotes("NOTES NOTES NOTES");
	
		
		test.getContactInfo();
		
		
	}
}