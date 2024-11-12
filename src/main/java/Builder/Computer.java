package Builder;

public class Computer {
    private String processor;
    private String ram;
    private String hardDrive;
    private String graphicsCard;
    private String os;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String printSpecs() {
        return "Processor: " + processor + "\nRAM: " + ram + "\nHard Drive: " + hardDrive + "\nGraphics Card: " + graphicsCard + "\nOS: " + os;
    }
}
