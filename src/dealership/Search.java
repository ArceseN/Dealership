package dealership;

import java.util.ArrayList;

public class Search {
	
	
	public static ArrayList<Object>newArray = inventory.allInventory();
	
	public static ArrayList<Object>builtArray = new ArrayList<>();
	
	public static void doSearch(String query) {
		
		
	
	//iterator 
	for (int i = 0; i < newArray.size(); i++) {		
	if (newArray.get(i).toString().contains(query)) {
		
		
	}
	
	}
	}

    public static void main(String[] args) {
    	
    	
    doSearch("Toyota");
    
    	
    }	

}
	
	


