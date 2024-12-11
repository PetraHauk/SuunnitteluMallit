package Command.Commands;

import Command.Pixel;
import Command.Command;
import javafx.scene.layout.GridPane;
import javafx.scene.Node;

public class CreateCodeCommand implements Command {
    private GridPane grid;

    public CreateCodeCommand(GridPane grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        System.out.println("int[][] pixelArt = {");

        // Iterate through the grid children
        for (int i = 0; i < grid.getChildren().size(); i++) {
            Node node = grid.getChildren().get(i);

            // Ensure that the node is an instance of Pixel
            if (node instanceof Pixel) {
                Pixel pixel = (Pixel) node;
                int rowIndex = i / 10;  // Determine the row index based on position
                int colIndex = i % 10;  // Determine the column index based on position

                // If we're at the start of a new row, print a new row opening
                if (colIndex == 0) {
                    System.out.print("{");
                }

                // Print 1 for pixels that are "on", and 0 for pixels that are "off"
                // In your specific case, you want to print 1 for the first column only
                System.out.print((colIndex == 0 && pixel.isOn()) ? "1" : "0");

                // If we've reached the end of a row (i % 10 == 9), close the row
                if (colIndex == 9) {
                    // For the last row, don't print a comma after it
                    if (i == grid.getChildren().size() - 1) {
                        System.out.println("}");
                    } else {
                        System.out.println("},");
                    }
                } else {
                    // Otherwise, continue printing the pixel with a comma
                    System.out.print(", ");
                }
            } else {
                System.err.println("Error: Node at index " + i + " is not a Pixel!");
            }
        }

        System.out.println("};");
    }
}

