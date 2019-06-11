
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
         
        //getters
          
        String type = newVehicle1.getType();
        String make = newVehicle1.getMake();
        String model = newVehicle1.getModel();
        String year = newVehicle1.getYear();
        String whole = newVehicle1.getWhole();
        String retail = newVehicle1.getRetail();
        String vin = newVehicle1.getVin();
 
                  
         vehicleArray.add(type);
         vehicleArray.add(make);
         vehicleArray.add(model);
         vehicleArray.add(year);
         vehicleArray.add(whole);
         vehicleArray.add(retail);
         vehicleArray.add(vin);

         
 
          
        return vehicleArray;
          
     }
      
     //function to add to inventArray
      
     public static ArrayList<Object> allInventory() {
          
         inventArray.add(arrayMake("help","me", "im", "stuck", "oh", "no", "no"));
         inventArray.add(arrayMake("wait", "I", "got", "it", "oh", "no", "no"));
         inventArray.add(arrayMake("oh", "god","its", "midnight", "oh", "no", "no"));
 
         return inventArray;
     }
 
     
      
       
               
 
      public static void main(String[] args) {
           
          Object cars = allInventory();
          System.out.println(cars);
           
          
           
                      }
 
 
}