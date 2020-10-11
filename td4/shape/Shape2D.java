package shape;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public abstract class Shape2D {

  protected String name;
  protected Color col;

  public double area() {
      return 0;
  }

  public double perimeter() {
        return 0;
  }

  public abstract Shape toShapeFX();

  public abstract void translate(double dx, double dy);

  public void translate(double delta) {
        translate(delta, delta);
    }

  public void print() {
        System.out.println("Shape2D");
    }
}
