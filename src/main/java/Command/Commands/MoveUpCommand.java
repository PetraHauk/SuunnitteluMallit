package Command.Commands;

import Command.Command;
import Command.MoveCursor;

public class MoveUpCommand implements Command {
    private MoveCursor moveCursor;

    public MoveUpCommand(MoveCursor moveCursor) {
        this.moveCursor = moveCursor;
    }

    @Override
    public void execute() {
        moveCursor.moveUp();
    }


}
