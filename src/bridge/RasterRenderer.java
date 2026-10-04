package bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("RasterRenderer: Drawing circle with radius %.2f using raster pixels%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("RasterRenderer: Drawing square with side %.2f using raster pixels%n", side);
    }
}