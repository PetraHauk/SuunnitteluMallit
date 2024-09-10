package Singelton;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();


        try {
            logger.setFileNames("log.txt");
            logger.write("Hello, world!");
            logger.write("This is a log message.");
            logger.write("Goodbye, world!");
            logger.close();

         } catch (
         IOException e) {
        e.printStackTrace();
         }
        }
}
