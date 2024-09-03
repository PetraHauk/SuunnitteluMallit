package Abstract_Factory.Buttons;

import javafx.scene.control.Button;

public class ButtonB extends Button{
    public ButtonB(String text) {
        super(text);
        display();
    }

    private void display() {
        setStyle("-fx-background-color: seagreen; -fx-text-fill: black; -fx-font-size: 14px; -fx-padding: 10px;");
    }
}
