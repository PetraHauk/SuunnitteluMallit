package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<User> users = new ArrayList<>();

    // Add a user to the mediator
    public void addUser(User user) {
        users.add(user);
    }

    // Get all users
    public List<User> getUsers() {
        return users;
    }

    // Send a message from one user to another
    public void sendMessage(String sender, String recipient, String message) {
        System.out.println(sender + " -> " + recipient + ": " + message);

        // Find the recipient user
        User recipientUser = users.stream()
                .filter(user -> user.getUsername().equals(recipient))
                .findFirst()
                .orElse(null);

        // If the recipient user is found, notify the user

        if (recipientUser != null) {
            recipientUser.receiveMessage(sender, message);
        }
    }
}
