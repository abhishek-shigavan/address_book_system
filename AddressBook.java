/**
 * AddressBook --- Program for simulation of Address Book System
 * 
 * 
 * @author Abhishek Shigavan
 *
 */
public class AddressBook {

/**
 * Taking contact details form user
 * 
 * @param args
 * 
 * @return No return
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Address Book Management System");
		//taking contact details 
		System.out.println("*****Contact Details*****");
		System.out.println("Enter First Name : ");
		String first_name = sc.next();
		
		System.out.println("Enter Last Name : ");
		String last_name = sc.next();
		
		System.out.println("Enter Address : ");
		String address = sc.next();
		
		System.out.println("Enter City : ");
		String city = sc.next();
		
		System.out.println("Enter State : ");
		String state = sc.next();
		
		System.out.println("Enter Zip Code : ");
		int zip_Code = sc.nextInt();
		
		System.out.println("Enter Mobile Number : ");
		int mob_No = sc.nextInt();
		
		System.out.println("Enter Email Id : ");
		String email = sc.next();
		
	}
}
