package dealership;

public class Vehicle {
	
	private String type;
	private String make;
	private String model;
	private String year;
	
	String setType(String setter) {
		
		return this.type = setter;
		
	}
	
	
	String setMake(String setter) {
		
		return this.make = setter;
		
	}
	
	
	String setModel(String setter) {
		
		return this.model = setter;
		
	}
	
	
	String setYear(String setter) {
		
		return this.year = setter;
		
	}
	
	String getType() {
		return this.type;
	}
	
	String getMake() {
		return this.make;
	}
	
	String getModel() {
		return this.model;
	}
	
	String getYear() {
		return this.year;
	}
	
	
	

}
