package Command;

public class MoveCursor {

    private int[] cursorPosition = {0, 0}; // {x, y}

    public MoveCursor(int[] cursorPosition) {
        this.cursorPosition = cursorPosition;
    }

    public void moveRight() {
        cursorPosition[0]++;
    }

    public void moveLeft() {
        cursorPosition[0]--;
    }

    public void moveUp() {
        cursorPosition[1]--;
    }

    public void moveDown() {
        cursorPosition[1]++;
    }

    public int[] getCursorPosition() {
        return cursorPosition;
    }

}
