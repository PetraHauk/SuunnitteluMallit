package Command.Commands;

import Command.MoveCursor;
import Command.Command;


public class MoveDownCommand implements Command {
    private MoveCursor moveCursor;

    public MoveDownCommand(MoveCursor moveCursor) {
        this.moveCursor = moveCursor;
    }

    @Override
    public void execute() {
        moveCursor.moveDown();
    }
}
