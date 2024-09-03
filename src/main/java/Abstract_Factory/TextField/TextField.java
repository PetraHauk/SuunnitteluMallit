package Abstract_Factory.TextField;

import javafx.scene.canvas.GraphicsContext;

public abstract class TextField {
    protected String text;

    public TextField(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract void display();
}