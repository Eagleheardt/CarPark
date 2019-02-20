import java.util.ArrayList;

abstract class Vehicle implements IVehicle{
	
	protected int _numberOfWheels;
	protected int _numberOfSeats;
	protected double _price;
	protected ArrayList<String> _features;
	
	protected int _modelYear;
	protected String _make;
	protected String _model;
	
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

    public void testDrive() {
    	System.out.print("**slaps roof**\n");
    	String drive = "This is a " + this._make + " " + this._model + "\n";
    	System.out.print(drive);
    	System.out.print("This baby right here has:\n");
    	
    	for (String s : this._features) {
    		System.out.print(s + "\n");
    	}
    	
    	System.out.print("\n");
    }

}
