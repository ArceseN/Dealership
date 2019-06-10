package dealership;
import java.util.*;

public class inventory{
	
// private ArrayList <Vehicle> Inventory;
	
	//declaration of a private ArrayList
	
	private ArrayList <Vehicle> vInt;
	
	//public constructor for new ArrayList
	
	public inventory() {
		this.vInt = new ArrayList<>();
	}
	
	//public inventory adder 
	
	public ArrayList <Vehicle> makeInvent(){
		
		//defining setter values 
		
				Vehicle newVehicle = new Vehicle();
				newVehicle.setType("Convertible");
				newVehicle.setMake("Lionel Make");
				newVehicle.setModel("Lionel Mode");
				newVehicle.setYear("1990");
				
				newVehicle.getType();
				newVehicle.getMake();
				newVehicle.getModel();
				newVehicle.getYear();	
				
				return vInt;
		
	}
	

	
	 public static void main(String[] args)
	    {  
		 
		 ArrayList<String> newArray = new ArrayList<>();
		 newArray.add("pull");
		 
		 System.out.println(); 
		 
	
	    }
	 
	

}
