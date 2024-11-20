package Bridge;

public class Workshop {
    public static void main(String[] args) {
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.getVehicle();
        bike.service();

        VehicleFactory busFactory = new BusFactory();
        Vehicle bus = busFactory.getVehicle();
        bus.service();
    }
}
