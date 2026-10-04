package bridge;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0);
        circle.draw();

        circle.setRenderer(rasterRenderer);
        circle.draw();

        Shape square = new Square(vectorRenderer, 8.0);
        square.draw();

        square.setRenderer(rasterRenderer);
        square.draw();
    }
}