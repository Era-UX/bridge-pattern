package bridge;

public class Square extends Shape {
    private double side;

    public Square(Renderer renderer, double side) {
        super(renderer);
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be greater than zero");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be greater than zero");
        }
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
}