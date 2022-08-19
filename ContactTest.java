/*Tyler Hollingsworth
  CS-320
  08-07-22*/

package Contact_Service;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	//verifies that the constructor works
		@Test
		void testContactClassDefaultConstructor() {
			Contact c = new Contact();
			assertTrue(c.contactId.equals("unknown"));
			assertTrue(c.firstName.equals("unknown"));
			assertTrue(c.lastName.equals("unknown"));
			assertTrue(c.phoneNum.equals("000000000"));
			assertTrue(c.address.equals("unknown"));
		}
	
	//verifies that the constructor works
	@Test
	void testContactClassConstructor() {
		Contact c = new Contact("0123456789", "tyler", "holli", "4239999999", "123 test");
		assertTrue(c.contactId.equals("0123456789"));
		assertTrue(c.firstName.equals("tyler"));
		assertTrue(c.lastName.equals("holli"));
		assertTrue(c.phoneNum.equals("4239999999"));
		assertTrue(c.address.equals("123 test"));
	}
	
	//verifies that an error is thrown for an id that is over the maximum length
	@Test
	void testContactClassIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("01234567891", "tyler", "holli", "4239999999", "123 test");
		});
	}
	
	//verifies that an error is thrown if the id is null
	@Test
	void testContactClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact(null, "tyler", "holli", "4239999999", "123 test");
		});
	}
	
	//verifies that an error is thrown if the first name is over the maximum length
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", "tyler holli", "holli", "4239999999", "123 test");
		});
	}
	
	//verifies that an error is thrown if the first name is null
	@Test
	void testContactClassFistNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", null, "holli", "4239999999", "123 test");
		});
	}
	
	//verifies that an error is thrown if the last name is over the maximum length
	@Test
	void testContactClassLastNameIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", "tyler", "tyler holli", "4239999999", "123 test");
		});
	}
	
	//verifies that an error is thrown if the last name is null
	@Test
	void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", "tyler", null, "4239999999", "123 test");
		});
	}
	
	//verifies that an error is thrown if the phone number is too short
	@Test
	void testContactClassPhoneNumTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", "tyler", "holli", "423999999", "123 test");
		});
	}
	
	//verifies that an error is thrown if the phone number is too long
	@Test
	void testContactClassPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", "tyler", "holli", "42399999999", "123 test");
		});
	}
	
	//verifies that an error is thrown if the phone number is null
	@Test
	void testContactClassPhoneNumIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", "tyler", "holli", null, "123 test");
		});
	}
	
	//verifies that an error is thrown if the address is over the maximum length
	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", "tyler", "holli", "4239999999", "1234567891011121314151617181920");
		});
	}
	
	//verifies that an error is thrown if the address is null
	@Test
	void testContactClassAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234567891", "tyler", "holli", "4239999999", null);
		});
	}

}