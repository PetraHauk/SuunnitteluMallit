package Bridge;

public class Bus implements Vehicle {
    @Override
    public void service() {
        System.out.println("Bus is being serviced.");
    }
}
