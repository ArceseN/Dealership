package dealership;

import java.util.ArrayList;
import java.util.Scanner;


// Generating a request ticket with customer's name, department needed, and vehicle requested
public class SalesRequestTicket {
	static ArrayList<String> requestTicket = new ArrayList<String>();
	
	 
	 public static void SRTicket() {
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter customer's name:");
   String clientName = input.nextLine();
   requestTicket.add(clientName);
    
   System.out.println("Department requested: ");
   String departmentName = input.nextLine();
   requestTicket.add(departmentName);
   
   System.out.println("Make and Model of car requested: ");
   String makeModel = input.nextLine();
   requestTicket.add(makeModel);
   
   // generating the id number for the queue. 
   int IdNum = 1;
   int DeptID = 0;
   
   switch(departmentName) {
      case "S" : 
    	  DeptID = 100;
    	  String DeptName = "Sales";
    	  break;
      case "F" :
    	  DeptID = 200;
    	  DeptName = "Finance";
    	  break;
      case "L" :
    	  DeptID = 300;
    	  DeptName = "Leasing";
    	  break;
   }
    int QID = IdNum + DeptID;
    
	 System.out.println("Customer: " + QID + " requests " + departmentName + " for this vehicle: " + makeModel);   
   }

   
 }

	 
