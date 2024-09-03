package Abstract_Factory.Checkbox;

import javafx.scene.control.CheckBox;

public class CheckboxB extends CheckBox{
    public CheckboxB(String text) {
        super(text);
        display();
    }

    @Override
    public void display() {
        setStyle("-fx-background-color: lightgray; -fx-text-fill: black; -fx-font-size: 14px; -fx-padding: 5px;");
    }
}
