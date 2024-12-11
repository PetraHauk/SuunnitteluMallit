package Command.Commands;

import Command.Command;
import Command.TogglePixels;

public class PixelOffCommand implements Command {
    private TogglePixels togglePixels;
    private int[] cursorPosition;

    public PixelOffCommand(TogglePixels togglePixels, int[] cursorPosition) {
        this.togglePixels = togglePixels;
        this.cursorPosition = cursorPosition;
    }

    @Override
    public void execute() {

    }

}
