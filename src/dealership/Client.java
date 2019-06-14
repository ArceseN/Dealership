package dealership;

import java.util.ArrayList;

public class Client {
	
	private String name;
	private String address;
	private String phone; 
	private String email;
	
	//TODO change to arrayList
	
	private ArrayList <Vehicle> ListofVehicles;
	private String deptChoice;
	
	//constructor 
	
	public Client(String name, String address, String phone, String email, String deptChoice) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.deptChoice = deptChoice;
		
	}
	//setters
	
	public Client() {
		// TODO Auto-generated constructor stub
		
	}

	public void setName(String name) {
		this.name = name; 
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

//	public String getCarChoice() {
//		return carChoice;
//	}

	//TODO which service am I looking for

	
	public String getdeptChoice( ) {
		return deptChoice;
	}

	public ArrayList <Vehicle> getListofVehicles() {
		return ListofVehicles;
	}

	public void setListofVehicles(ArrayList <Vehicle> listofVehicles) {
		ListofVehicles = listofVehicles;
	}
	
	public void addVehicleToListofVehicles(Vehicle car) {
		
		this.ListofVehicles.add(car);
	}
	
		
}
