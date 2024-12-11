package Command;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pixel extends Rectangle {
    private boolean isOn;

    public Pixel() {
        super(30, 30, Color.WHITE);
        this.isOn = false;
    }

    public void setFillColor() {
        if (isOn) {
            super.setFill(Color.BLACK);
        } else {
            super.setFill(Color.WHITE);
        }
    }

    public void toggle() {
        isOn = !isOn;
        setFillColor();
    }

    public boolean isOn() {
        return isOn;
    }
}
