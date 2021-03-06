import java.util.ArrayList;

public class SUV extends Vehicle{
	
	public SUV(){
		super._typeOfVehicle = "SUV";
		
		super._modelYear = 0;
		super._make = "no make";
		super._model = "no model";
		
		super._numberOfWheels = 4;
		super._numberOfSeats = 7;
		super._price = 9999.99;
		super._features = new ArrayList<String>();
	}
	
	public SUV(int year, String make, String model, ArrayList<String> features, double cost, int seats){
		super._typeOfVehicle = "SUV";
		
		super._modelYear = year;
		super._make = make;
		super._model = model;
		
		super._numberOfWheels = 4;
		super._numberOfSeats = seats;
		super._price = cost;
		super._features = features;
	}
}
