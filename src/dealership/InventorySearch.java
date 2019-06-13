package dealership;

import java.util.ArrayList;

public class InventorySearch {
	
	
	private ArrayList<Object>newArray = inventory.allInventory();
	
	private ArrayList<Object> finalArray = new ArrayList<>();
	private Object notFound = "not found";
	
	
	public Object doSearch(String query) {
				
	//iterator 
	for (int i = 0; i < newArray.size(); i++) {		
		if (newArray.get(i).toString().contains(query)) {
			finalArray.add(newArray.get(i));
		}
		
	
	}
	if (finalArray.isEmpty()) {
		return notFound;
	}
	newArray = finalArray;
	
	
	return finalArray;
	
    
	
	}
	
	public ArrayList<Object> getFinalArray(){
		return finalArray;
		
	}
	
	public InventorySearch() {
	}

    public static void main(String[] args) {
    	
    InventorySearch newSearch = new InventorySearch();
   System.out.print( newSearch.doSearch("Sedan"));
       
    	
    
    
    	
    }	

}
	
	


