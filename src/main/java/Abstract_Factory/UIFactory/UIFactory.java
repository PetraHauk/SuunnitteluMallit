package Abstract_Factory.UIFactory;

import Abstract_Factory.Buttons.Button;
import Abstract_Factory.Checkbox.Checkbox;
import Abstract_Factory.TextField.TextField;
import javafx.scene.canvas.Canvas;

public abstract class UIFactory {

    public Canvas createCanvas() {
        return new Canvas(400, 400);  // Default size
    }

    public abstract Button createButton(String text);
    public abstract Checkbox createCheckbox(String text);
    public abstract TextField createTextField(String text);
}
