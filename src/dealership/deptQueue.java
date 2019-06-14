package dealership;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class deptQueue {
	private Queue<Client> sd = new LinkedList<Client>();
	private Queue<Client> fd = new LinkedList<Client>();
	private Queue<Client> ld = new LinkedList<Client>();
	
	
	// added <Client> to the object Queue, and it removed the warning about it being raw and should be parametized
	//getter for Sales Dept
	public Queue<Client> getSalesD() {
		return this.sd;
	}
	
	
	// getter for Finance Dept
	public Queue<Client> getFinanceD() {
		return this.fd;
	}
	
	//getter for Leasing Dept
	public Queue<Client> getLeasing() {
		return this.ld;
	}
	
	
	
	public void deptQueueAdd(Client input) {

	//  getting the customer's department choice from Client and adding to the proper dept queue.
	
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
