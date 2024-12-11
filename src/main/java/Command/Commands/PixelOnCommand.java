package Command.Commands;

import Command.TogglePixels;
import Command.Command;

public class PixelOnCommand implements Command {
    private TogglePixels togglePixels;
    private int[] cursorPosition;


    public PixelOnCommand(TogglePixels togglePixels, int[] cursorPosition) {
        this.togglePixels = togglePixels;
        this.cursorPosition = cursorPosition;
    }

    @Override
    public void execute() {
        togglePixels.togglePixel(cursorPosition[0], cursorPosition[1]);
    }

}
