import java.util.ArrayList;
import java.util.List;
/**
 * ContactStore --- Program to store the Contact Details
 * 
 * @author Abhishek Shigavan
 *
 */
public class ContactStore {
	
	//creating ArrayList
	List<ContactDetails> contactList = new ArrayList();
/**
 * This method adds contact into ArrayList
 * 	
 * @param contactDetails
 * 
 * @return No return
 */
	public void addContact(ContactDetails contactDetails) {
		
		contactList.add(contactDetails);
	}
/**
 * This method prints all the contacts
 * of ArrayList
 * 
 * @return No return	
 */
	public void printContact() {
	
		for(int i=0; i < contactList.size(); i++) {
			
			System.out.println(contactList.get(i));
		}
	}

}
