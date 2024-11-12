package Builder;

public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer buildComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOs();
        return computerBuilder.getComputer();
    }
}
