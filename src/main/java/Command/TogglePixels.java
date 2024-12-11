package Command;

public class TogglePixels {

    private Pixel[][] pixels;

    public TogglePixels(int gridSize) {
        pixels = new Pixel[gridSize][gridSize];
    }
    public void togglePixel(int x, int y) {
        if (pixels[x][y] != null) {
            pixels[x][y].toggle();
        }
    }

    public void setPixel(int x, int y, Pixel pixel) {
        pixels[x][y] = pixel;
    }

}
