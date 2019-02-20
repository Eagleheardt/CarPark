import java.util.ArrayList;

public class Truck extends Vehicle{
	
	public Truck(){
		super._modelYear = 0;
		super._make = "no make";
		super._model = "no model";
		
		super._numberOfWheels = 4;
		super._numberOfSeats = 2;
		super._price = 9999.99;
		super._features = new ArrayList<String>();
		super._features.add("No features.");
	}
	
	public Truck(int year, String make, String model, int numWheels, ArrayList<String> features, double cost, int seats){
		super._modelYear = year;
		super._make = make;
		super._model = model;
		
		super._numberOfWheels = numWheels;
		super._numberOfSeats = seats;
		super._price = cost;
		super._features = features;
	}

}
