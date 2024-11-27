package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype<Recommendation> {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    @Override
    public Recommendation clone() {
        Recommendation recommendation = new Recommendation(targetAudience);
        for (Book book : books) {
            recommendation.addBook(book.clone());
        }
        return recommendation;
    }

    @Override
    public void print() {

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        System.out.println("Recommendation for " + targetAudience + ":");
        for (Book book : books) {
            book.print();
        }

        System.out.println();
        System.out.println("--------------------");
    }
}
