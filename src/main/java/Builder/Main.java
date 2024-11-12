package Builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        ComputerDirector officePCBuilder = new ComputerDirector(officeComputerBuilder);
        Computer officeComputer = officePCBuilder.buildComputer();
        System.out.println("Office Computer:");
        System.out.println(officeComputer.printSpecs());

        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector gamingPCBuilder = new ComputerDirector(gamingComputerBuilder);
        Computer gamingComputer = gamingPCBuilder.buildComputer();
        System.out.println("\nGaming Computer:");
        System.out.println(gamingComputer.printSpecs());
    }
}
