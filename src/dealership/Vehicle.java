
package dealership;
 
//import java.util.*;
 
public class Vehicle {
     
    private String type;
    private String make;
    private String model;
    private String year; 
    private String wholesaleCost;
    private String retailCost;
    private String vin;
    private String tow;
    private String wheel;
   // private String w;
    
     
    public Vehicle (String type, String make, String model, String year, String wholesaleCost , String retailCost , String vin , String tow, String wheel) {
    	  this.type = type;
    	   this.make = make;
    	     this.model = make;
    	   this.year = year; 
    	    this.wholesaleCost = wholesaleCost;
    	    this.retailCost = retailCost;
    	    this.vin = vin ;
    	    this.tow = tow;
    	    this.wheel = wheel; 
   
    }
     
    //setters
     
    public void setType (String setter) {
        this.type =  setter;
    }
     
    public void setMake (String setter) {
        this.make =  setter;
    }
     
    public void setModel (String setter) {
        this.model =  setter;
    }
     
    public void setYear (String setter) {
        this.year =  setter;
    }
    
    public void setWhole (String setter) {
        this.wholesaleCost =  setter;
    }
    
    public void setRetail (String setter) {
        this.retailCost =  setter;
    }
    
    public void setVim (String setter) {
        this.vin =  setter;
    }
    
    public void setTow (String setter) {
        this.tow =  setter;
    }
    
    public void setWheel(String setter) {
    	this.wheel = setter;
    }
     
    //getters
     
    public String getType() {
        return this.type;
    }
     
    public String getMake() {
        return this.make;
    }
     
    public String getModel() {
        return this.model;
    }
     
    public String getYear() {
        return this.year;
    }
    
    public String getWhole() {
        return this.wholesaleCost;
    }
    
    public String getRetail() {
        return this.retailCost;
    }
    
    public String getVin() {
        return this.vin;
    }
    
    //isLeasable function that returns a boolean value
    public Boolean isLeasable(Boolean lease) {
    	return lease;
    	
    	
    }

	public String getTow() {
		// TODO Auto-generated method stub
		return this.tow;
	}
	
	public String getWheel() {
		return this.wheel;
	} 
     
 //TODO System dot out car information
         
         
    }
    