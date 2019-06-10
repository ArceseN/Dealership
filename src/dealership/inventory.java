package dealership;
import java.util.*;

public class inventory{
		
	//declaring a private array to utilize later
	
	private static ArrayList<String> newArray = new ArrayList<>();
	
	//public getter of an arraylist with the elements being vehicle values
	
	public static ArrayList<String> GetterArray()
	{
		
		ArrayList<String> tempArray = new ArrayList<>();
		
		Vehicle newVehicle = new Vehicle();
		newVehicle.setType("Convertible");
		
		tempArray.add(newVehicle.getType());
		return tempArray;
		
	}
	
	//constructor setting 
	public inventory () {
		newArray = GetterArray();
	}
	

	
	 public static void main(String[] args)
	    {  
		 inventory newEntry = new inventory();
		System.out.println(newEntry.toString()); 
	
	    }
	 
	

}
