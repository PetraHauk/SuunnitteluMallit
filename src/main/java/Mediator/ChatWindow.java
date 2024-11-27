package Mediator;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.List;

public class ChatWindow {
    private User user;
    private TextArea messageArea;
    private TextField messageField;
    private ComboBox<String> recipientComboBox;
    private Button sendButton;

    // Constructor that accepts a user
    public ChatWindow(User user) {
        this.user = user;
    }

    // Start method that sets up the window
    public void start(Stage stage) {
        // Initialize the chat window components
        messageArea = new TextArea();
        messageArea.setEditable(false);

        messageField = new TextField();

        // Initialize ComboBox for selecting recipient
        recipientComboBox = new ComboBox<>();
        recipientComboBox.setPromptText("Select Recipient");

        // Populate the ComboBox with available users (excluding the current user)
        populateRecipientComboBox();

        sendButton = new Button("Send");

        // Set up the send button to send the message
        sendButton.setOnAction(e -> {
            String recipient = recipientComboBox.getValue();
            String message = messageField.getText();

            if (recipient != null && !recipient.isEmpty() && message != null && !message.isEmpty()) {
                Mediator mediator = user.getMediator();
                mediator.sendMessage(user.getUsername(), recipient, message);

                // Append the message to the message area
                messageArea.appendText(user.getUsername() + " -> " + recipient + ": " + message + "\n");

                // Clear the message field
                messageField.clear();
            }
        });

        // Set up the layout
        VBox vbox = new VBox(10, messageArea, recipientComboBox, messageField, sendButton);
        Scene scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);
        stage.setTitle(user.getUsername());
        stage.show();
    }

    // Populate the recipientComboBox with available users
    private void populateRecipientComboBox() {
        Mediator mediator = user.getMediator();
        List<User> users = mediator.getUsers();

        for (User u : users) {
            if (!u.getUsername().equals(user.getUsername())) {
                recipientComboBox.getItems().add(u.getUsername());
            }
        }
    }

    // Update Message Area
    public void updateMessageArea(String message) {
        messageArea.appendText(message + "\n");
    }
}
