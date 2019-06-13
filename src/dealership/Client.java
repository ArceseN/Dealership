package dealership;


public class Client {
	
	private String name;
	private String address;
	private String phone; 
	private String email;
	
	//TODO change to arrayList
	private String carChoice; 
	
	//constructor 
	
	public Client(String name, String address, String phone, String email, String carChoice) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.carChoice = carChoice;
		
	}
	//setters
	
	public void setName(String setter) {
		this.name = setter; 
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;	
	}
	
	public void setCarChoice(String carChoice) {
		this.carChoice = carChoice;
	}	
	
	//getters
	
	public String getName() {
	return this.name; 	
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getCarChoice() {
		return carChoice;
	}
	
	//TODO which service am I looking for

	
}
