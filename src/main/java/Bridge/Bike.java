package Bridge;

public class Bike implements Vehicle {
    @Override
    public void service() {
        System.out.println("Bike is being serviced.");
    }
}
