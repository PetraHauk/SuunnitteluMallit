package Builder;

public interface ComputerBuilder {
    public void buildProcessor();
    public void buildRam();
    public void buildHardDrive();
    public void buildGraphicsCard();
    public void buildOs();

    public Computer getComputer();
}
