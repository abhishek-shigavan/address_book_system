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
 * This method takes first name as parameter
 * and check weather it is present in ArrayList or not
 * 	
 * @param first_name
 * 
 * @return flag value 
 * 			true -- if name is present
 * 			false -- if name is not present
 */
	public boolean checkContact(String first_name) {
		
		boolean flag = false;
		for(int i=0; i < contactList.size(); i++) {
			
			if(contactList.get(i).getFirst_Name().equals(first_name)) {
				
				flag = true;
			}
		}
		
		return flag;	
	}
/**
 * This method matches first name with ArrayList
 * element.
 * And sets user given value for all the field associated
 * with first name
 *   	
 * @param first_name
 * @param contactDetails
 * 
 * @return No return
 */
	public void editContact(String first_name, ContactDetails contactDetails) {
		
		for(int i =0; i < contactList.size(); i++) {
			
			if(contactList.get(i).getFirst_Name().equals(first_name)) {
				
				contactList.get(i).setFirst_Name(contactDetails.getFirst_Name());
				contactList.get(i).setLast_Name(contactDetails.getLast_Name());
				contactList.get(i).setAddress(contactDetails.getAddress());
				contactList.get(i).setCity(contactDetails.getCity());
				contactList.get(i).setState(contactDetails.getState());
				contactList.get(i).setZip_Code(contactDetails.getZip_Code());
				contactList.get(i).setMob_No(contactDetails.getMob_No());
				contactList.get(i).setEmail(contactDetails.getEmail());
				
			}
		}		
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

