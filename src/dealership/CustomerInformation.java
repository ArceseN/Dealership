package dealership;

import java.util.*;

public class CustomerInformation {
	
	
	
	 
	 
	 
	 public static Client showFrontdeskmenu() {
		 
		 //creating an arraylist to store the customer's personal information
		 
		 ArrayList <String> personalInfo = new ArrayList<>();
			
			 
			   Scanner input = new Scanner(System.in);
			     
				 System.out.println("Full Name: ");
			    String name = input.nextLine();
			     personalInfo.add(name);
			   
			     System.out.println("Address: ");
			    String address = input.nextLine();
			     personalInfo.add(address);
			     
			     System.out.println("Phone Number (xxx)xxx-xxxx: ");
			     String phone = input.nextLine();
			     personalInfo.add(phone);
			     
			     System.out.println("Email Address: ");
			     String email = input.nextLine();
			     personalInfo.add(email);
			     
			     System.out.println("What is the client's car preference?");
			     String carChoice = input.nextLine();
			     personalInfo.add(carChoice);
			     

			 System.out.println(personalInfo);
			 Client newPerson = new Client(personalInfo.get(0), personalInfo.get(1), personalInfo.get(2), personalInfo.get(3), personalInfo.get(4));
		 
		 return newPerson; 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(showFrontdeskmenu().getName());
 
   
     
	// System.out.println("Which user are you Type 1 for front desk , Type 2 for Sales Type 3 for whatever else you want: ");
    //if(input.nextLine().equalsIgnoreCase("1"){
    	
    	//showFrontdeskmenu();
    	
   // }

	}
 }



