package dealership;

import java.util.ArrayList;

public class InventorySearch {
	
	
	private ArrayList<Object>newArray = inventory.allInventory();
	
	private ArrayList<Object> finalArray = new ArrayList<>();
	private Object notFound = "not found";
	
	//newArray Setter
	
	public void setNewArray(ArrayList<Object> setter) {
		this.newArray = setter;
	}
	
	
	public Object doSearch(ArrayList<Object> searchedArray, String query) {
				
	//iterator 
	for (int i = 0; i < newArray.size(); i++) {		
		if (!searchedArray.get(i).toString().contains(query)) {
			searchedArray.remove(searchedArray.get(i));
			
		}
		
	
	}
	if (searchedArray.isEmpty()) {
		return notFound;
	}	
	
	return searchedArray;

	}
	
	//newArray getter
	
	public  ArrayList<Object> getNewArray(){
		return newArray;
	}
	
	public InventorySearch() {
		
		getNewArray();
		
	}

	
	// Remove main when done testing
//    public static void main(String[] args) {
//    	
//    //initialize new instance and print search
//    	
//    InventorySearch newSearch = new InventorySearch();
//    System.out.println(newSearch.doSearch(newSearch.getNewArray(), "Sedan"));  
//
//   
//   //TODO: searching through returned value
//   
//   
//   
//   
//       
//    	
//    
//    
    	
    }	

//}
	
	


