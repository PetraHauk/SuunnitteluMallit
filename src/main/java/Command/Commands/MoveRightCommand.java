package Command.Commands;

import Command.MoveCursor;
import Command.Command;

public class MoveRightCommand implements Command {
    private MoveCursor moveCursor;

    public MoveRightCommand(MoveCursor moveCursor) {
        this.moveCursor = moveCursor;
    }

    @Override
    public void execute() {
        moveCursor.moveRight();
    }
}
