package Singelton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private String fileName;
    private Logger() {
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileNames(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void write(String message) throws IOException {
        writer.write(message);
        writer.newLine();
        writer.flush();
    }

    public void close() throws IOException {
        writer.close();
    }
}
