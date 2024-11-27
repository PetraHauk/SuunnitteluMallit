package Prototype;

public class Book implements Prototype<Book> {
    private String title;
    private String author;
    private String genre;
    private int year;

    public Book(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public Book clone() {
        return new Book(title, author, genre, year);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + author + " (" + genre + ", " + year + ")");
    }
}
