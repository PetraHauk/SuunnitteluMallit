package Mediator;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);  // Launch the single JavaFX application
    }

    @Override
    public void start(Stage primaryStage) {
        Mediator mediator = new Mediator();

        // Create users
        User hanna = new User("Hanna", mediator);
        User mika = new User("Mika", mediator);
        User maisa = new User("Maisa", mediator);

        // Add users to the mediator
        mediator.addUser(hanna);
        mediator.addUser(mika);
        mediator.addUser(maisa);

        // Launch chat windows for all users
        launchChatWindow(hanna);
        launchChatWindow(mika);
        launchChatWindow(maisa);
    }

    public void launchChatWindow(User user) {
        // Create a new chat window (stage) for the user
        ChatWindow chatWindow = new ChatWindow(user);
        user.setChatWindow(chatWindow);  // Set the chat window for the user

        Stage stage = new Stage();
        chatWindow.start(stage);  // Start the window to initialize all fields
    }
}
