package dealership;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class deptQueue {
	Scanner input = new Scanner(System.in);
	
	Queue<String> sd = new LinkedList<String>();
	Queue<String> fd = new LinkedList<String>();
	Queue<String> ld = new LinkedList<String>();
	
	System.out.println("Please enter the requested department: Sales, Finance, or Leasing");
	
	if (input = "Sales") {
		sd.add(Client());
	} else if(input = "Finance") {
		fd.add(Client());
	} else if (input = "Leasing") {
		ld.add(Client());
	}
	
	}

}
