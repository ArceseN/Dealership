package dealership;

import java.util.*;

public class inventory extends Vehicle {
	
	//something that counts the items in the array
	//item declaration
	
	
	

		
	//have to list TYPE(0), MAKE(1), MODEL(2), YEAR(3)
	
	
	
	 public static void main(String[] args)
	    {  
		 Vehicle newVehicle = new Vehicle();
		 
		 newVehicle.getType();
		 
		 ArrayList<Object> inventList = new ArrayList<>();
		 inventList.add(newVehicle);
		 System.out.println(inventList); 
	    }
	 
	

}
