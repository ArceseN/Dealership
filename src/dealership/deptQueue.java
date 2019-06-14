package dealership;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class deptQueue {
	private Queue<Client> sd = new LinkedList<Client>();
	private Queue<Client> fd = new LinkedList<Client>();
	private Queue<Client> ld = new LinkedList<Client>();
	
	
	
	//getter for sd
	// getter for fd
	//getter for ld 
	
	
	//Scanner input = new Scanner(System.in);
	//String dqinfo = input.nextLine();
	public void deptQueueAdd(Client input) {

	
	System.out.println("Please enter the requested department: Sales, Finance, or Leasing");
	
	if (input.getdeptChoice() == "Sales") {
		sd.add(input);
	}
	 if(input.getdeptChoice()  == "Finance") {		 
	 	fd.add(input);
	 }
	 if ( input.getdeptChoice()  == "Leasing") {
		ld.add(input);
	}
	
  }

}
