package Bridge;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Bike();
    }
}
