package dealership;

//will probably end up making this a builder

public class Vehicle {

	public Object type;
	public Object make;
	public Object model;
	public Object year;
	
	
	public void setType(Object typeSet) {
		typeSet = type;
	}
	
	public void setMake(Object makeSet) {
		makeSet = make;
	}
	
	
	public void setModel(Object modelSet) {
		modelSet = model;
	}
	
	public void setYear(Object yearSet) {
		yearSet = year;
	}
	
	public Object getType() {
		return type;
	}
	
	public Object getMake() {
		return make;
	}
	
	public Object getModel() {
		return model;
	}
	
	public Object getYear() {
		return year;
	}
	
	
}
