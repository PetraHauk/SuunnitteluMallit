package Builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core i5-9400F");
    }

    @Override
    public void buildRam() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("512GB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Integrated Intel UHD Graphics 630");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows 10 Pro");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
