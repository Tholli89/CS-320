/*Tyler Hollingsworth
  CS-320
  08-07-22*/

package Contact_Service;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest extends ContactService {
	
	//constructs four contact objects and adds them to the list before each test
	@BeforeEach
	void setUp() {
		Contact c1 = new Contact("0123456789", "ty", "holli", "4239999999", "123 test");
		Contact c2 = new Contact("9876543210", "Meg", "holli", "4238888888", "321 test");
		Contact c3 = new Contact("1111111111", "Ali", "holli", "4237777777", "abc test");
		Contact c4 = new Contact("2222222222", "tuck", "holli", "4236666666", "cba test");
		addContact(c1);
		addContact(c2);
		addContact(c3);
		addContact(c4);
	}
	
	//removes any remaining contacts in the list after every test
	@AfterEach
	void tearDown() {
		if (listOfContacts.size() != 0) {
			int index = 0;
			while (index < listOfContacts.size()) {
				listOfContacts.remove(listOfContacts.get(index));
			}
		}
	}
	
	//verifies that the addContact method adds contacts to the list
	@Test
	void testContactServerClassAddsContact() {
		Contact c = new Contact("1234567890", "tyler", "holli", "4239999999", "123 test");
		addContact(c);
		assertTrue(listOfContacts.size() == 5);
	}
	
	//verifies that an error is thrown when adding a contact id that already exists in the list
	@Test
	void testContactServerClassAddsExistingContactId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact c = new Contact("0123456789", "tyler", "holli", "4239999999", "123 test");
			addContact(c);
		});
	}
	
	//verifies that the deleteContact method removes contacts from the list
	@Test
	void testContactServerClassDeletesContact() {
		deleteContact("0123456789");
		deleteContact("9876543210");
		deleteContact("1111111111");
		
		assertTrue(listOfContacts.size() == 1);
	}
	
	//verifies that the deleteContact method throws error when list is empty
		@Test
		void testContactServerClassDeletesContactEmptyList() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				if (listOfContacts.size() != 0) {
					int index = 0;
					while (index < listOfContacts.size()) {
						listOfContacts.remove(listOfContacts.get(index));
					}
				}
				deleteContact("1111111111");
				});
			}
	
	//verifies that the updateFirstName method updates the correct contacts first name
	@Test
	void testContactServerClassUpdatesFirstName() {
		updateFirstName("0123456789", "bob");
		assertTrue("bob".equals(listOfContacts.get(0).firstName));
	}
	
	//verifies that the updateFirstName method throws error when list is empty
	@Test
	void testContactServerClassUpdatesFirstNameEmptyList() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			if (listOfContacts.size() != 0) {
				int index = 0;
				while (index < listOfContacts.size()) {
					listOfContacts.remove(listOfContacts.get(index));
				}
			}
			updateFirstName("0123456789", "bob");
			});
		}
	
	//verifies that the updateLastName method updates the correct contacts last name
	@Test
	void testContactServerClassUpdatesLastName() {
		updateLastName("0123456789", "smith");
		assertTrue("smith".equals(listOfContacts.get(0).lastName));
	}
	
	//verifies that the updateLastName method throws error when list is empty
	@Test
	void testContactServerClassUpdatesLastNameEmptyList() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			if (listOfContacts.size() != 0) {
				int index = 0;
				while (index < listOfContacts.size()) {
					listOfContacts.remove(listOfContacts.get(index));
				}
			}
			updateLastName("0123456789", "smith");
			});
		}
	
	//verifies that the updatePhoneNum method updates the correct contacts phone number
	@Test
	void testContactServerClassUpdatesPhoneNum() {
		updatePhoneNum("0123456789", "4231111111");
		assertTrue("4231111111".equals(listOfContacts.get(0).phoneNum));
	}
	
	//verifies that the updatePhoneNum method throws error when list is empty
	@Test
	void testContactServerClassUpdatesPhoneNumEmptyList() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			if (listOfContacts.size() != 0) {
				int index = 0;
				while (index < listOfContacts.size()) {
					listOfContacts.remove(listOfContacts.get(index));
				}
			}
			updatePhoneNum("0123456789", "4231111111");
			});
		}
	
	//verifies that the updateAddress method updates the correct contacts address
	@Test
	void testContactServerClassUpdatesAddress() {
		updateAddress("0123456789", "somewhere");
		assertTrue("somewhere".equals(listOfContacts.get(0).address));
	}
	
	//verifies that the updateAddress method throws error when list is empty
	@Test
	void testContactServerClassUpdatesAddressEmptyList() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			if (listOfContacts.size() != 0) {
				int index = 0;
				while (index < listOfContacts.size()) {
					listOfContacts.remove(listOfContacts.get(index));
				}
			}
			updateAddress("0123456789", "somewhere");
			});
		}
	
}