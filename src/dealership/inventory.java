package dealership;
import java.util.*;

public class inventory{
	
// private ArrayList <Vehicle> Inventory;
	
	//declaration of a private ArrayList
	
	private ArrayList <String> vInt;
	
	//public constructor for new ArrayList
	
	public inventory() {
		this.vInt = new ArrayList<>();
	}
	
	//public inventory adder 
	
	public ArrayList<String> makeInvent(){
		
		//defining setter values 
		
				Vehicle newVehicle = new Vehicle();
				newVehicle.setType("Convertible");
				newVehicle.setMake("Lionel Make");
				newVehicle.setModel("Lionel Mode");
				newVehicle.setYear("1990");
				
				//using getters 
				
				vInt.add(newVehicle.getType());
				newVehicle.getMake();
				newVehicle.getModel();
				newVehicle.getYear();	
				
				return vInt;
		
	}
	

	
	 public static void main(String[] args)
	    {  
		 
		inventory getInvent = new inventory();
		 		 
		 System.out.println(getInvent); 
		 
	
	    }
	 
	

}
