package Abstract_Factory.Buttons;

import javafx.scene.control.Button;

public class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
        display();
    }

    private void display() {
        setStyle("-fx-background-color: coral; -fx-text-fill: black; -fx-font-size: 14px; -fx-padding: 10px;");
    }
}
