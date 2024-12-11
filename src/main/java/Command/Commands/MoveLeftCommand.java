package Command.Commands;

import Command.MoveCursor;
import Command.Command;

public class MoveLeftCommand implements Command {
    private MoveCursor moveCursor;

    public MoveLeftCommand(MoveCursor moveCursor) {
        this.moveCursor = moveCursor;
    }

    @Override
    public void execute() {
        moveCursor.moveLeft();
    }
}
