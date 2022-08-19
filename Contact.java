/*Tyler Hollingsworth
  CS-320
  08-07-22*/

package Contact_Service;
import java.util.Scanner;

public class Contact {
	static Scanner scn = new Scanner(System.in);
	
	//sets the maximum or exact lengths for the passed parameters
	private static final int contact_Id_Length = 10;
	private static final int contact_FirstName_Length = 10;
	private static final int contact_LastName_Length = 10;
	private static final int contact_PhoneNum_Length = 10;
	private static final int contact_Address_Length = 30;
	
	protected final String contactId;
	protected String firstName;
	protected String lastName;
	protected String phoneNum;
	protected String address;
	
	//default constructor
	Contact(){
		contactId = "unknown";
		firstName = "unknown";
		lastName = "unknown";
		phoneNum = "000000000";
		address = "unknown";
	}
	
	//constructor With all inputs
	Contact(String contactId, String firstName, String lastName, String phoneNum, String address){
		
		//it statement to verify the id is not null and is less than the maximum length
		if(contactId == null || contactId.length() > contact_Id_Length){
			throw new IllegalArgumentException("Invalid contact ID: Entry is Null or too long!");
		}
		//it statement to verify the first name is not null and is less than the maximum length
		if(firstName == null || firstName.length() > contact_FirstName_Length){
			throw new IllegalArgumentException("Invalid first name: Entry is Null or too long!");
		}
		//it statement to verify the last name is not null and is less than the maximum length
		if(lastName == null || lastName.length() > contact_LastName_Length){
			throw new IllegalArgumentException("Invalid Last name: Entry is Null or too long!");
		}
		//it statement to verify the phone number is not null and is exactly the correct length
		if(phoneNum == null || phoneNum.length() != contact_PhoneNum_Length){
			throw new IllegalArgumentException("Invalid phone number: Entry is not " + contact_PhoneNum_Length + " !");
		}
		//it statement to verify the address is not null and is less than the maximum length
		if(address == null || address.length() > contact_Address_Length){
			throw new IllegalArgumentException("Invalid Address: Entry is Null or too long!");
		}
		
		//sets the variables to the given and verified passed parameters
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}

}