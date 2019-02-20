import java.util.ArrayList;

abstract class Vehicle implements IVehicle{
	
	protected int _numberOfWheels;
	protected int _numberOfSeats;
	protected double _price;
	protected ArrayList<String> _features;
	
	
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

    public void testDrive() {
    	System.out.print("**slaps roof**");
    	System.out.print("This baby right here has:");
    	
    	for (String s : this._features) {
    		System.out.print(s);
    	}
    	
    	System.out.print("");
    }

}
