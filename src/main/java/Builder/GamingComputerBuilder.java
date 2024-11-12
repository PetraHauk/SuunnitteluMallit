package Builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core i9-9900K");
    }

    @Override
    public void buildRam() {
        computer.setRam("32GB DDR4");
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("1TB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA GeForce RTX 2080 Ti");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows 10 Home");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
