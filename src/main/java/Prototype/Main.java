package Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create predefined recommendations
        Recommendation defaultYoungAdultsRecommendation = new Recommendation("Young Adults");
        defaultYoungAdultsRecommendation.addBook(new Book("The Hunger Games", "Suzanne Collins", "Dystopian", 2008));
        defaultYoungAdultsRecommendation.addBook(new Book("Divergent", "Veronica Roth", "Science Fiction", 2011));

        Recommendation defaultAdultsRecommendation = new Recommendation("Adults");
        defaultAdultsRecommendation.addBook(new Book("1984", "George Orwell", "Dystopian", 1949));
        defaultAdultsRecommendation.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 1951));

        // A list to store custom recommendations
        List<Recommendation> customRecommendations = new ArrayList<>();

        // Welcome message
        System.out.println("Welcome to the Book Recommendation System!");

        // Start with a predefined recommendation
        Recommendation currentRecommendation = null;

        // Display initial choices
        System.out.println("Choose a recommendation to start with:");
        System.out.println("1. Young Adults");
        System.out.println("2. Adults");
        //System.out.println("3. Create your own recommendation");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Initialize the currentRecommendation based on user choice
        switch (choice) {
            case 1:
                currentRecommendation = defaultYoungAdultsRecommendation.clone();
                break;
            case 2:
                currentRecommendation = defaultAdultsRecommendation.clone();
                break;
            /*
            case 3:
                System.out.print("Enter the target audience for your recommendation: ");
                String audience = scanner.nextLine();
                currentRecommendation = new Recommendation(audience);
                customRecommendations.add(currentRecommendation); // Add custom recommendation to list
                break;
            */
            default:
                System.out.println("Invalid choice! Exiting.");
                scanner.close();
                return; // Exit if the user enters an invalid option
        }

        // Main menu loop for interacting with the chosen recommendation list
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View current recommendation");
            System.out.println("2. Clone and modify recommendation");
            System.out.println("3. Add a book to the recommendation");
            System.out.println("4. Remove a book from the recommendation");
            System.out.println("5. Choose a different recommendation list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int action = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (action) {
                case 1:
                    System.out.println("\nCurrent Recommendation:");
                    currentRecommendation.print();
                    break;

                case 2:
                    System.out.println("Cloning the recommendation...");
                    currentRecommendation = currentRecommendation.clone();
                    System.out.println("Cloned Recommendation:");
                    currentRecommendation.print();
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    currentRecommendation.addBook(new Book(title, author, genre, year));
                    System.out.println("Book added!");
                    currentRecommendation.print();
                    break;

                case 4:
                    System.out.println("Books in the recommendation:");
                    for (int i = 0; i < currentRecommendation.getBooks().size(); i++) {
                        System.out.println((i + 1) + ". " + currentRecommendation.getBooks().get(i).getTitle());
                    }
                    System.out.print("Enter the number of the book to remove: ");
                    int bookIndex = scanner.nextInt() - 1;
                    if (bookIndex >= 0 && bookIndex < currentRecommendation.getBooks().size()) {
                        currentRecommendation.removeBook(currentRecommendation.getBooks().get(bookIndex));
                        System.out.println("Book removed!");
                        currentRecommendation.print();
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 5:
                    // Call the method to choose a different recommendation list
                    currentRecommendation = chooseRecommendation(scanner, defaultYoungAdultsRecommendation, defaultAdultsRecommendation, customRecommendations);
                    break;

                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to handle choosing a different recommendation list
    private static Recommendation chooseRecommendation(Scanner scanner, Recommendation defaultYoungAdultsRecommendation,
                                                       Recommendation defaultAdultsRecommendation, List<Recommendation> customRecommendations) {
        System.out.println("Choose a recommendation to switch to:");
        System.out.println("1. Young Adults");
        System.out.println("2. Adults");
        // System.out.println("3. Custom Recommendations");
        System.out.print("Enter your choice: ");
        int switchChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Recommendation newRecommendation = null;

        switch (switchChoice) {
            case 1:
                newRecommendation = defaultYoungAdultsRecommendation.clone();
                System.out.println("Switched to Young Adults recommendation.");
                break;
            case 2:
                newRecommendation = defaultAdultsRecommendation.clone();
                System.out.println("Switched to Adults recommendation.");
                break;

                /*
            case 3:
                if (customRecommendations.isEmpty()) {
                    System.out.println("No custom recommendations available.");
                } else {
                    System.out.println("Choose a custom recommendation:");
                    for (int i = 0; i < customRecommendations.size(); i++) {
                        System.out.println((i + 1) + ". " + customRecommendations.get(i).getTargetAudience());
                    }
                    int customChoice = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    if (customChoice >= 0 && customChoice < customRecommendations.size()) {
                        newRecommendation = customRecommendations.get(customChoice).clone();
                        System.out.println("Switched to " + newRecommendation.getTargetAudience() + " recommendation.");
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
                break;
                 */

            default:
                System.out.println("Invalid choice! Returning to the menu.");
                break;
        }

        return newRecommendation;
    }
}
