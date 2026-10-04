/*
 * Bridge Design Pattern: Decoupling Shape abstraction from Renderer implementation.
 * Allows independent extension of geometries and rendering targets at runtime.
 */
package bridge;

public interface Renderer {
    void renderCircle(double radius);
    void renderSquare(double side);
}