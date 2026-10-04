package bridge;

import java.util.Objects;

public abstract class Shape {
    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer, "Renderer must not be null");
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = Objects.requireNonNull(renderer, "Renderer must not be null");
    }

    public abstract void draw();
}