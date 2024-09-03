package Abstract_Factory.TextField;

import javafx.scene.control.TextField;


public class TextFieldB extends TextField{
    public TextFieldB(String text) {
        super(text);
    }

    private void customizeAppearance() {
        setStyle("-fx-background-color: lightyellow; -fx-text-fill: black; -fx-font-size: 14px; -fx-padding: 5px;");
    }
}
