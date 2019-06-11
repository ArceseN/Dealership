
package dealership;
 
import java.util.*;
 
public class inventory {
     
    //new ArrayList to use with vehicle class
     
    public static ArrayList<Object> inventArray = new ArrayList<>(); 
     
     
    //big ArrayList function that returns a single vehicle array with details as elements
     
     public static ArrayList<String> arrayMake(String setType, String setMake, String setModel, String setYear, String setWhole, String setRetail, String setVin) 
     {
          
         
        //new instance of vehicle class 
        Vehicle newVehicle1 = new Vehicle();
        //actual ArrayList function
        ArrayList<String> vehicleArray = new ArrayList<>(); 
         
        //setters
         
        newVehicle1.setType(setType);
        newVehicle1.setMake(setMake);
        newVehicle1.setModel(setModel);
        newVehicle1.setYear(setYear);
        newVehicle1.setWhole(setWhole);
        newVehicle1.setRetail(setRetail);
        newVehicle1.setVim(setVin);
        newVehicle1.setTow("3,500lbs to 5000lbs towing capacity");
        newVehicle1.setWheel("FWD");
        newVehicle1.setW();
         
        //getters
          
        String type = newVehicle1.getType();
        String make = newVehicle1.getMake();
        String model = newVehicle1.getModel();
        String year = newVehicle1.getYear();
        String whole = newVehicle1.getWhole();
        String retail = newVehicle1.getRetail();
        String vin = newVehicle1.getVin();
        String lease = newVehicle1.isLeasable(true).toString();
        String tow = newVehicle1.getTow();
        String wheel = newVehicle1.getWheel();
        
 
                  
         vehicleArray.add(type);
         vehicleArray.add(make);
         vehicleArray.add(model);
         vehicleArray.add(year);
         vehicleArray.add(whole);
         vehicleArray.add(retail);
         vehicleArray.add(vin);
        // vehicleArray.add(lease);
         
         if (type == "Light Truck") {
        	 
        	 vehicleArray.add(tow);
        	 vehicleArray.add(wheel);
        	// vehicleArray.add(grossW);
        	// vehicleArray.add(w);
        	// vehicleArray.add(4Wheel);
         }

         
 
          
        return vehicleArray;
          
     }
      
     //function to add to inventArray
      
     public static ArrayList<Object> allInventory() {
    	           
         inventArray.add(arrayMake("Convertible","Chevrolet", "Camaro", "2019", "$24,295", "25,000", "5FNYF4H68CB073947"));
         inventArray.add(arrayMake("Sedan", "Toyota", "Camry", "2019", "22,360", "24,095", "2HGES15883H938740"));
         inventArray.add(arrayMake("Light Truck", "Honda","Ridgeline", "2019", "", "33,382", "no"));
 
         return inventArray;
     }
               
 
      public static void main(String[] args) {
           
          System.out.println(allInventory());
           
          
           
                      }
 
 
}