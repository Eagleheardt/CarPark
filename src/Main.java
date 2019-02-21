import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Truck truck1 = new Truck();
		
		truck1.testDrive();
		
		ArrayList<String> truck2Features = new ArrayList<String>();
		
		truck2Features.add("Extended cab");
		truck2Features.add("Full-size bed");
		
		Truck truck2 = new Truck(1998,"Ford","F150", 6, truck2Features,19999.99, 5);
		
		truck2.testDrive();
		
		Car car1 = new Car();
		
		car1.testDrive();
		
		ArrayList<String> car2features = new ArrayList<String>();
		
		car2features.add("3rd row seats");
		car2features.add("Spoiler");
		
		Car car2 = new Car(1999, "Toyota", "Camry",car2features, 4999.95, 5);
		
		car2.testDrive();
		
		System.out.print(car2);
		
	}

}
