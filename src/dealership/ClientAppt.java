package dealership;


import java.util.ArrayList;
import java.util.Scanner;


public class ClientAppt {
	
	
	
	public static String ClientAppt() {
		Scanner scText = new Scanner(System.in); 
	   	ArrayList<String> Appointment = new ArrayList<>(); //ArrayList to hold appointment information
			   // Prompting for creating the appointment for either today or tomorrow's date
			   System.out.println("Is the appointment for today? (y/n)");
			   String answer = scText.nextLine();
			   
			   System.out.println("Please enter date for appointment: "); // Enter today's date
			   String apptDate = scText.nextLine();
				  Appointment.add(apptDate);
			  			   
			   // Prompt for earliest time for appointment.
			   System.out.println("Please enter a time for appointment: "); // Enter a test time
			   String apptTime = scText.nextLine();
			      Appointment.add(apptTime);
	           
			   System.out.println("Customer has an appointment on " + Appointment.get(0) + " at "+ Appointment.get(1));           
			    Scanner in,close;
				return null;
		   }

	private static String ignoreCase(String string) {
	
		return null;
	}
         }

