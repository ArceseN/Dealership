package dealership;


public class Client {
	
	private String name;
	private String address;
	private String phone; 
	private String email;
	private String carChoice; 
	private String deptChoice;
	
	//constructor 
	
	public Client(String name, String address, String phone, String email, String carChoice) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.carChoice = carChoice;
		this.deptChoice = deptChoice;
		
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
	public void setdeptChoice(String deptChoice) {
		this.deptChoice = deptChoice;
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
	
	public String getdeptChoice( ) {
		return deptChoice;
	}
	
		
}
