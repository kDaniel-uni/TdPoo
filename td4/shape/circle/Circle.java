package shape.circle;

import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;
import shape.Shape2D;
import shape.point.Point2D;

public class Circle extends Shape2D {

  private Point2D center;
  private double radius;

  public Circle(Point2D center, double radius, String name, Color col) {
    this.center = center;
    this.radius = radius;
    this.name = name;
    this.col = col;
  }
  public Circle(Point2D center, double radius, String name) {
    this.center = center;
    this.radius = radius;
    this.name = name;
    this.col = Color.BLACK;
  }

  public double area() {
    return 2*Math.PI*radius*radius;
  }

  public double perimeter() {
    return 2*Math.PI*radius;
  }

  public void translate(double dx, double dy) {
    center.translate(dx,dy);
  }

  public String toString() {
    return name + " : (" + center + ", " + radius + ")";
  }

  public boolean pointIsInside(Point2D p){
    return center.distance(p) < radius;
  }

  public Shape toShapeFX(){
    return new javafx.scene.shape.Circle(center.getX(),center.getY(),radius, col);
  }
}
