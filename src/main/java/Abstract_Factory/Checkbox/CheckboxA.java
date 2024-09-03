package Abstract_Factory.Checkbox;

import javafx.scene.control.CheckBox;

public class CheckboxA extends CheckBox {
    public CheckboxA(String text) {
        super(text);
        display();
    }

    private void display() {
        setStyle("-fx-background-color: lightgray; -fx-text-fill: black; -fx-font-size: 14px; -fx-padding: 5px;");
    }
}
