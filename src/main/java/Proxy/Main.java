package Proxy;

import java.nio.file.AccessDeniedException;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        User user1 = new User("Hanna");
        User user2 = new User("Erika");
        User user3 = new User("Veikko");

        library.createProtectedDocument("doc1", "01.01.2020", "Hello World", user1);
        library.createProtectedDocument("doc2", "02.02.2020", "Hello Universe", user2);
        library.createProtectedDocument("doc3", "03.03.2020", "Bye World", user3);

        try {

            System.out.println("Accessing doc1 by Hanna:");
            System.out.println(library.getDocument("doc1").getContent(user1)+"\n");

            System.out.println("Accessing doc2 by Erika:");
            System.out.println(library.getDocument("doc2").getContent(user2)+"\n");

            System.out.println("Accessing doc3 by Veikko:");
            System.out.println(library.getDocument("doc3").getContent(user3)+"\n");

            System.out.println("Attempting unauthorized access of doc1 by Erika:");
            System.out.println(library.getDocument("doc1").getContent(user2)+"\n");

        } catch (AccessControlServise e) {
            System.out.println(e.getMessage());
        }
    }
}
