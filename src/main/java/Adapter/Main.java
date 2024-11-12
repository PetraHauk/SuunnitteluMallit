package Adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(2);
        date.setMonth(8);
        date.setYear(2023);

        System.out.println("Day: " + date.getDay() + " Month: " + date.getMonth() + " Year: " + date.getYear());

        date.advanceDays(100);

        System.out.println("Day: " + date.getDay() + " Month: " + date.getMonth() + " Year: " + date.getYear());

    }
}
