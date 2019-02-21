import java.util.ArrayList;

abstract class Vehicle implements IVehicle{
	
	protected int _numberOfWheels;
	protected int _numberOfSeats;
	protected double _price;
	protected ArrayList<String> _features;
	
	protected int _modelYear;
	protected String _make;
	protected String _model;
	
	protected String _typeOfVehicle;
	
    public int getNumberOfWheels() {
    	return this._numberOfWheels;
    }

    public int getNumberOfSeats() {
    	return this._numberOfSeats;
    }

    public double getPrice() {
    	return this._price;
    }

    public ArrayList<String> getFeatures() {
    	return this._features;
    }

    public void addFeature(String feature) {
    	this._features.add(feature);
    }
    
    public int getYear() {
    	return this._modelYear;
    }
    
    public String carMake() {
    	return this._make;
    }
    
    public String carModel() {
    	return this._model;
    }
    
    public String toString() {
    	
    	String output = "";
    	output += "Year: " + this._modelYear + "\n";
    	output += "Make: " + this._make + "\n";
    	output += "Model: " + this._model+ "\n";
    	
    	output += "Features: \n";
    	
    	for (String s : this._features) {
    		output += s + "\n";
    	}
    	
    	return output;
    	
    }

    public void testDrive() {
    	System.out.print("**slaps roof**\n");
    	System.out.print("This here is a " + this._typeOfVehicle + "\n");
    	String drive = "It's a " + this._make + " " + this._model + "\n";
    	System.out.print(drive);
    	System.out.print("This baby right here has:\n");
    	
    	for (String s : this._features) {
    		System.out.print(s + "\n");
    	}
    	
    	System.out.print("\n");
    }

}
