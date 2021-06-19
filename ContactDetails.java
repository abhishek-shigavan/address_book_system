/**
 * ContactDetails --- Program to define format of Contact Details
 * 
 * @author Abhishek Shigavan
 *
 */
public class ContactDetails {

	//defining contact field
	private String first_Name;
	private String last_Name;
	private String address;
	private String city;
	private String state;
	private int zip_Code;
	private int mob_No;
	private String email;
	
	//To get first name value
	public String getFirst_Name() {
		return first_Name;
	}

	//To set first name value
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	//To get last name value
	public String getLast_Name() {
		return last_Name;
	}

	//To set last name value
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	//To get address value
	public String getAddress() {
		return address;
	}

	//To set address value
	public void setAddress(String address) {
		this.address = address;
	}

	//To get city value
	public String getCity() {
		return city;
	}

	//To set city value
	public void setCity(String city) {
		this.city = city;
	}

	//To get state value
	public String getState() {
		return state;
	}

	//To set state vale
	public void setState(String state) {
		this.state = state;
	}

	//To get zip code value
	public int getZip_Code() {
		return zip_Code;
	}

	//To set zip code value
	public void setZip_Code(int zip_Code) {
		this.zip_Code = zip_Code;
	}

	//To get mobile no value
	public int getMob_No() {
		return mob_No;
	}

	//To set mobile no value
	public void setMob_No(int mob_No) {
		this.mob_No = mob_No;
	}

	//To get email value
	public String getEmail() {
		return email;
	}

	//To set email value
	public void setEmail(String email) {
		this.email = email;
	}


/**
 * Defining format for contact details
 * 
 * @return No return	
 */
	public String toString() {
		return "ContactDetails [first_Name=" + first_Name + ", last_Name=" + last_Name + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip_Code=" + zip_Code + ", mob_No=" + mob_No + ", email="
				+ email + "]";
	}
	
}
