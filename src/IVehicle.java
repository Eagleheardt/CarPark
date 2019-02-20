import java.util.ArrayList;

public interface IVehicle {

    int getNumberOfWheels();

    int getNumberOfSeats();

    double getPrice();

    ArrayList<String> getFeatures();

    void addFeature(String feature);

    void testDrive();

}
