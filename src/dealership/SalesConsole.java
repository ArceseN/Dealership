package dealership;

import java.util.Scanner;

// Message to department of a customer waiting

public class SalesConsole implements SRTicket {
	
	public static void SalesConsole() { 
		Scanner input = new Scanner(System.in);
		int QID = 0;
		QID = SRTicket.get(QID);
		   
		   System.out.println("Login: Enter department name");
		   String DeptName = input.nextLine();
		   
		   switch(DeptName) {
		      case "Sales" :
			    if (QID > 101 && QID < 200);
			    System.out.println("Sales dept has a customer waiting in the queue.");
			    break;
			   
		      case "Finance" :
			    if (QID > 201 && QID < 300);
			    System.out.println("Finance dept has a customer waiting in the queue.");
			    break;
			   
		      case "Leasing" :
			    if (QID > 301 && QID < 400);
			    System.out.println("Leasing dept has a customer waiting in the queue.");
			    break;
		   }
		   
		   System.out.println("To accept the customer, please enter (Y)");
		   String DAnswer = input.nextLine();  
		     if  (DAnswer == "Y") {
		//Get department specific info with ClientInfo();
		     }
	}

}
