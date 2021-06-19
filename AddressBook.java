import java.util.Scanner;
/**
 * AddressBook --- Program for simulation of Address Book System
 * 
 * 
 * @author Abhishek Shigavan
 *
 */
public class AddressBook {
	
	//Declaring global for using in more than 1 method
	Scanner sc = new Scanner(System.in);
	
	static AddressBook addressBook = new AddressBook();
	
	static ContactStore contactStore = new ContactStore();
	
	static ContactDetails contactDetails = new ContactDetails();
/**
 * This method takes contact details from user.
 * And add it using addContact() of ContactStore
 * 	
 * @return No return
 */
	public void addContact() {
		
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
 * This method takes first name of contact
 * from user.
 * Check weather the contact is present or not.
 * If contact is present then asks for new details.
 * And pass this new details to editContact() and update it. 
 *
 * @return No return
 */
	public void editContact() {
		
		System.out.println("Enter First Name of person to edit contact : ");
		String firstName = sc.next();
		//checking the contact is present or not
		boolean isPresent = contactStore.checkContact(firstName);
		
		//updating contact details if contact is present
		if(isPresent == true) {
			
			//Taking new value of contact
			System.out.println("***** New Contact Details *****");
			
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
			
			//calling editContact() of ContactStore
			contactStore.editContact(first_name, contactDetails);
			
		}
		else {
			System.out.println("No such contact in AddressBook");
		}
	}
/**
 * This method display menu of operation
 * user can perform
 * And according to operation calling method
 * 
 * @return No return
 * 	
 */
	public void showMenu() {
		
		boolean flag = true;
		
		//printing menu again & again till user chose to exit
		while(flag) {
		
			System.out.println("*** Address Book System ***");
			System.out.println("1. Add Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. View AddressBook");
			System.out.println("4. Exit");
			System.out.println("Enter ur option (1-4) :");
			int option = sc.nextInt();
		
			switch (option) {
				case 1: {
					//calling addContact()
					addressBook.addContact();
					break;
				}
				case 2: {
				
					addressBook.editContact();
					break;
				}
				case 3: {
				
					contactStore.printContact();
					break;
				}
				case 4: {
				
					flag = false;	//to exit loop
					break;
				}
				default: {
					break;
				}
				
			}
		}
	}
/**
 * calling showMenu()
 * 
 * @param args
 * 
 * @return No return
 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Management System");
		
		addressBook.showMenu();
			
	}
}

