package Memento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;

    private String timestamp;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); // Set timestamp
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options.clone(); // Return a copy of options array
    }

    public String getTimestamp() {
        return timestamp;
    }

    public boolean isSelected() {
        return isSelected;
    }
}