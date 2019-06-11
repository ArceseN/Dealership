package customerProfile;

import java.util.*;

public class CustomerInformation {
	
	//creating an arraylist to store the customer's personal information
	
	 static ArrayList<String> personalInfo = new ArrayList<String>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
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
     

 System.out.println(personalInfo);
 
	}
 }



