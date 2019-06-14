
package dealership;
 
import java.util.*;


 
public class inventoryFactory {
     
    //new ArrayList to use with vehicle class
     
    private ArrayList<Vehicle> inventArray = new ArrayList<>(); 
     
     
    public ArrayList<Vehicle> getInventory() {
    	return this.inventArray;
    }
    //big ArrayList function that returns a single vehicle array with details as elements
     
     public void AddCartoInventory(String type, String make, String model, String year, String wholesaleCost , String retailCost , String vin , String tow, String wheel) 
     {
          
         
        //new instance of vehicle class 
       inventArray.add(new Vehicle(type,make,model,year,wholesaleCost ,retailCost ,vin ,tow,wheel));   
     }
      
     //function to add to inventArray
      
     public void CreateInventory() {
    	           
    	 AddCartoInventory("Convertible","Chevrolet", "Camaro", "2019", "$24,295", "25,000", "5FNYF4H68CB073947",null, null);
    	 AddCartoInventory("Sedan", "Toyota", "Camry", "2019", "22,360", "24,095", "2HGES15883H938740",null,null);
    	 AddCartoInventory("Sedan", "Toyota", "Camry", "2010", "22,360", "24,095", "2HGES15883H938740",null,null);
    	 AddCartoInventory("Sedan", "Toyota", "Corolla", "2018", "17,577", "18,600", "WVWBM7AJ6CW294146",null,null);
    	 AddCartoInventory("Light Truck", "Honda","Ridgeline", "2019", "$$$$$$", "33,382", "W04GW5EV5B1191212",null,null);

     }
               
 
      public static void main(String[] args) {
    	  
           
         // System.out.println(allInventory().toString().replace("[","").replace("]","").replace(", Sedan", "Sedan").replace(", Light", "Light").replace(", ", "; "));

           
          
           
                      }
 
 
}