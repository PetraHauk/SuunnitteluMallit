package Decorator;

import java.io.File;
import java.io.FileWriter;

public class FilePrinter extends PrinterDecorator {

    public FilePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {

        try (FileWriter writer = new FileWriter(new File("output.txt"), true)) {
             //Write the text to the file
             writer.write(text + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Prints the message to the console
        printer.print(text);
    }
}
