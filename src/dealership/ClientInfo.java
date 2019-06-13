package dealership;


import java.util.*;


public class ClientInfo {
	
	static ArrayList<String> personalInfo = new ArrayList<String>();
	
	 	 
	 public static void ClientInfo() {
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
    
    //Lionel: Added Department choice for the client to pick from:
    
    System.out.println("Department Choice: ");
    String department = input.nextLine();
    personalInfo.add(department);
	
//    while (input.hasNextLine()) {
//   	 personalInfo.add(input.nextLine());
//   
//    }
     System.out.println(personalInfo);
     
  

	}
	// Scanner in.close();

}
