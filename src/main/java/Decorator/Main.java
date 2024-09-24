package Decorator;

public class Main {

    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello World");

        Printer encryptedPrinter = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        encryptedPrinter.print("Hello World");
    }


}
