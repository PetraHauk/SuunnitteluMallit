package Bridge;

public class BusFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Bus();
    }
}
