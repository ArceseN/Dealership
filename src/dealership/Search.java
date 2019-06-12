package dealership;

import java.util.ArrayList;

public class Search {
	
	
	public static ArrayList<Object>newArray = inventory.allInventory();
	
	public static void doSearch(String query) {
	
	//iterator 
	for (int i = 0; i < newArray.size(); i++) {		
	if (newArray.get(i).toString().contains(query)) {
		System.out.println(newArray.get(i).toString());
	}
	
	}
	}

    public static void main(String[] args) {
    	
    	
    doSearch("Toyota");
    
    	
    }	

}
	
	


