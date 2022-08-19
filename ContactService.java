/*Tyler Hollingsworth
  CS-320
  08-07-22*/

package Contact_Service;
import java.util.ArrayList;
import java.util.List;


public class ContactService extends Contact{
	
	//creates an empty list for contact objects
	public static List<Contact> listOfContacts = new ArrayList<Contact>();
	
	//method to add a contact to the list
	public static void addContact(Contact c) {
		
		//if the list is empty then add the contact
		if (listOfContacts.size() == 0) {
			listOfContacts.add(c);
			System.out.print("Contact added! \n");
		}
		//if the list is not empty then iterate over the list to verify the id does not already exists in the list
		else {
			int index = 0;
			boolean newContact = true;
			 while (index < listOfContacts.size()) {
				if (c.contactId.equals(listOfContacts.get(index).contactId)) {
					 newContact = false;
					 throw new IllegalArgumentException("This unique ID already exists!");
					 }
					 index++;
			 }
			 //if the contact does not exist in the list then add it to the list
			if (newContact == true) {
				listOfContacts.add(c);
				System.out.print("Contact added! \n");
			}
		}
		}
	
	//method to delete a contact from the list
	public static void deleteContact(String id) {
		
		//if the list is empty throw an error
		if (listOfContacts.size() == 0) {
			throw new IllegalArgumentException("This task list is empty!");
		}
		//if the list is not empty then iterate over the list to verify if the id exists in the list and remove it if it does
		else {
			int index = 0;
			while (index < listOfContacts.size()) {
				if (id.equals(listOfContacts.get(index).contactId)) {
					 listOfContacts.remove(listOfContacts.get(index));
					 System.out.print("Contact deleted! \n");
					 }
					 index++;
					 }
		}
		
	}
	
	//method to update the first name of a contact
	public static void updateFirstName(String id, String fName) {
		
		//if the list is empty throw an error
		if (listOfContacts.size() == 0) {
			throw new IllegalArgumentException("This task list is empty!");
		}
		//if the list is not empty then iterate over the list to verify if the id exists in the list and update the first name if it does
		else {
			int index = 0;
			while (index < listOfContacts.size()) {
				if (id.equals(listOfContacts.get(index).contactId)) {
					listOfContacts.get(index).firstName = fName;
					System.out.print("First name updated! \n");
					 }
					 index++;
					 }
		}
	}
	
	//method to update the last name of a contact
	public static void updateLastName(String id, String lName) {
		
		//if the list is empty throw an error
		if (listOfContacts.size() == 0) {
			throw new IllegalArgumentException("This task list is empty!");
		}
		//if the list is not empty then iterate over the list to verify if the id exists in the list and update the last name if it does
		else {
			int index = 0;
			while (index < listOfContacts.size()) {
				if (id.equals(listOfContacts.get(index).contactId)) {
					listOfContacts.get(index).lastName = lName;
					System.out.print("Last name updated! \n");
					 }
					 index++;
			}
		}
	}
	
	//method to update the phone number of a contact
	public static void updatePhoneNum(String id, String pNum) {
		
		//if the list is empty throw an error
		if (listOfContacts.size() == 0) {
			throw new IllegalArgumentException("This task list is empty!");
		}
		//if the list is not empty then iterate over the list to verify if the id exists in the list and update the phone number if it does
		else {
			int index = 0;
			while (index < listOfContacts.size()) {
				if (id.equals(listOfContacts.get(index).contactId)) {
					listOfContacts.get(index).phoneNum = pNum;
					System.out.print("Phone number updated! \n");
					 }
					 index++;
			}
		}
	}
	
	//method to update the address of a contact
	public static void updateAddress(String id, String addr) {
		
		//if the list is empty throw an error
		if (listOfContacts.size() == 0) {
			throw new IllegalArgumentException("This task list is empty!");
		}
		//if the list is not empty then iterate over the list to verify if the id exists in the list and update the address if it does
		else {
			int index = 0;
			while (index < listOfContacts.size()) {
				if (id.equals(listOfContacts.get(index).contactId)) {
					listOfContacts.get(index).address = addr;
					System.out.print("Address updated! \n");
					 }
					 index++;
			}
		}
	}
}