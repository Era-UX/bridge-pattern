# Bridge Pattern — Shape and Renderer System

This project demonstrates the **Bridge Design Pattern** in Java (JDK 17) by decoupling high-level geometric shape abstractions from low-level rendering implementations.

## Features
- **Independent Hierarchies:** Shapes (Circle, Square) and Renderers (VectorRenderer, RasterRenderer) can vary and scale independently.
- **Composition over Inheritance:** Avoids combinatorial class explosion by using an object reference to the implementor interface.
- **Runtime Flexibility:** Supports switching rendering targets dynamically at runtime via setter injection.
- **Clean Code Adherence:** Strictly follows SRP, DIP, and OCP principles.

## Project Structure
- src/bridge/Renderer.java — Implementor interface
- src/bridge/VectorRenderer.java — Concrete Implementor (vector output)
- src/bridge/RasterRenderer.java — Concrete Implementor (raster pixel output)
- src/bridge/Shape.java — Abstraction base class
- src/bridge/Circle.java — Refined Abstraction
- src/bridge/Square.java — Refined Abstraction
- src/bridge/Main.java — Client demonstration

## How to Run
1. Clone the repository:
   git clone
2. Navigate to the source directory and compile:
   javac src/bridge/*.java
3. Run the client application:
   java -cp src bridge.Main