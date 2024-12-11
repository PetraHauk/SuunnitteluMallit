package Command.Commands;

import Command.Pixel;
import Command.Command;
import javafx.scene.layout.GridPane;

public class CreateCodeCommand implements Command {

    private GridPane grid;

    public CreateCodeCommand(GridPane grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        int gridSize = 10;

        System.out.println("int[][] pixelArt = {");

        for (int i = 0; i < gridSize; i++) {
            System.out.print("    {");

            for (int j = 0; j < gridSize; j++) {
                Pixel pixel = null;
                for (javafx.scene.Node node : grid.getChildren()) {
                    if (GridPane.getRowIndex(node) != null && GridPane.getColumnIndex(node) != null) {
                        if (GridPane.getRowIndex(node) == i && GridPane.getColumnIndex(node) == j) {
                            if (node instanceof Pixel) {
                                pixel = (Pixel) node;
                                break;
                            }
                        }
                    }
                }

                if (pixel != null) {
                    System.out.print(pixel.isOn() ? "1" : "0");

                    if (j < gridSize - 1) {
                        System.out.print(", ");
                    }
                }
            }

            System.out.println("},");
        }

        System.out.println("};");
    }
}
