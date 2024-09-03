package Abstract_Factory.TextField;

import javafx.scene.control.TextField;

public class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
        customizeAppearance();
    }

    private void customizeAppearance() {
        setStyle("-fx-background-color: lightyellow; -fx-text-fill: black; -fx-font-size: 14px; -fx-padding: 5px;");
    }
}