package bridge;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("VectorRenderer: Drawing circle with radius %.2f using vectors%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("VectorRenderer: Drawing square with side %.2f using vectors%n", side);
    }
}