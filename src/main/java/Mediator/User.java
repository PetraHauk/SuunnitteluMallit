package Mediator;

public class User {
    private String username;
    private Mediator mediator;

    private ChatWindow chatWindow;

    // Constructor
    public User(String username, Mediator mediator) {
        this.username = username;
        this.mediator = mediator;
    }

    public String getUsername() {
        return username;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setChatWindow(ChatWindow chatWindow) {
        this.chatWindow = chatWindow;
    }

    // Receive a message from another user
    public void receiveMessage(String sender, String message) {
        // Call the updateMessageArea() method in the associated ChatWindow to display the message
        if (chatWindow != null) {
            String messageToDisplay = sender + " -> " + username + ": " + message;
            chatWindow.updateMessageArea(messageToDisplay);  // Update the message area in the ChatWindow
        } else {
            // Fallback if the chatWindow is null (although this shouldn't happen if set properly)
            System.out.println("No chat window available for user: " + username);
        }
    }
}
