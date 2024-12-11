package Command;

import Command.Commands.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;


public class GUI extends Application {

    private int[] cursorPosition = {0, 0}; // {x, y}
    private static final int GRID_SIZE = 10;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Command Pattern Pixel Editor");

        MoveCursor moveCursor = new MoveCursor(cursorPosition);
        TogglePixels togglePixels = new TogglePixels(GRID_SIZE);

        // Create Command objects
        MoveRightCommand right = new MoveRightCommand(moveCursor);
        MoveDownCommand down = new MoveDownCommand(moveCursor);
        MoveLeftCommand left = new MoveLeftCommand(moveCursor);
        MoveUpCommand up = new MoveUpCommand(moveCursor);

        PixelOffCommand pixOff = new PixelOffCommand(togglePixels, cursorPosition);
        PixelOnCommand pixOn = new PixelOnCommand(togglePixels, cursorPosition);

        VBox vbox = new VBox();

        GridPane grid = createGrid(togglePixels);
        CreateCodeCommand createCode = new CreateCodeCommand(grid);

        // Cursor indicator
        Rectangle cursor = new Rectangle(30, 30, Color.TRANSPARENT);
        cursor.setStroke(Color.RED);
        cursor.setStrokeWidth(2);

        grid.getChildren().add(cursor);

        Scene scene = new Scene(vbox);

        // Add event handlers
        scene.setOnKeyPressed(e -> {
            KeyCode code = e.getCode();
            switch (code) {
                case RIGHT:
                    right.execute();
                    break;
                case DOWN:
                    down.execute();
                    break;
                case LEFT:
                    left.execute();
                    break;
                case UP:
                    up.execute();
                    break;
                case SPACE:
                    pixOn.execute();
                    System.out.println("Pixel at " + cursorPosition[0] + ", " + cursorPosition[1] + " toggled");
                    break;
                case BACK_SPACE:
                    pixOff.execute();
                    break;
                case ENTER:
                    createCode.execute();
                    break;
            }
            cursor.setTranslateX(cursorPosition[0] * 30);
            cursor.setTranslateY(cursorPosition[1] * 30);
        });

        vbox.getChildren().add(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createGrid(TogglePixels togglePixels) {
        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                Pixel pixel = new Pixel();
                grid.add(pixel, i, j);
                togglePixels.setPixel(i, j, pixel);
            }
        }
        return grid;
    }
}