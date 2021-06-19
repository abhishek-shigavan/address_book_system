import java.util.Scanner;
/**
 * AddressBook --- Program for simulation of Address Book System
 * 
 * 
 * @author Abhishek Shigavan
 *
 */
public class AddressBook {
	
	Scanner sc = new Scanner(System.in);
/**
 * This method takes contact details from user.
 * And add it using addContact() of ContactStore
 * 	
 * @return No return
 */	
	public void addContact() {
		
		ContactDetails contactDetails = new ContactDetails();
		
		ContactStore contactStore = new ContactStore();
		System.out.println("Welcome to Address Book Management System");
		//taking contact details 
		System.out.println("*****Contact Details*****");
		
		System.out.println("Enter First Name : ");
		String first_name = sc.next();
		contactDetails.setFirst_Name(first_name);	//passing value 
				
		System.out.println("Enter Last Name : ");
		String last_name = sc.next();
		contactDetails.setLast_Name(last_name);
				
		System.out.println("Enter Address : ");
		String address = sc.next();
		contactDetails.setAddress(address);
				
		System.out.println("Enter City : ");
		String city = sc.next();
		contactDetails.setCity(city);
				
		System.out.println("Enter State : ");
		String state = sc.next();
		contactDetails.setState(state);
				
		System.out.println("Enter Zip Code : ");
		int zip_Code = sc.nextInt();
		contactDetails.setZip_Code(zip_Code);
				
		System.out.println("Enter Mobile Number : ");
		int mob_No = sc.nextInt();
		contactDetails.setMob_No(mob_No);
				
		System.out.println("Enter Email Id : ");
		String email = sc.next();
		contactDetails.setEmail(email);
		
		//adding to ArrayList
		contactStore.addContact(contactDetails);

	}
/**
 * Calling addContact() method
 * 
 * @param args
 * 
 * @return No return
 */
	public static void main(String[] args) {
		
		AddressBook addressBook = new AddressBook();
		
		addressBook.addContact();
			
	}
}

