package dealership;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class deptQueue {
	Scanner input = new Scanner(System.in);
	String dqinfo = input.nextLine();
	public void deptQueueAdd() {
	Queue<String> sd = new LinkedList<String>();
	Queue<String> fd = new LinkedList<String>();
	Queue<String> ld = new LinkedList<String>();
	
	System.out.println("Please enter the requested department: Sales, Finance, or Leasing");
	
	if (dqinfo == "Sales") {
		sd.addAll(ClientInfo.personalInfo);
	}
	 if(dqinfo == "Finance") {		 
	 	fd.addAll(ClientInfo.personalInfo);
	 }
	 if (dqinfo == "Leasing") {
		ld.addAll(ClientInfo.personalInfo);
	}
	
  }

}
