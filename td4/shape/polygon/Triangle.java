package shape.polygon;

import shape.Shape2D;
import shape.point.Point2D;

public class Triangle extends Shape2D {

  private Point2D p1;
  private Point2D p2;
  private Point2D p3;

  public Triangle(Point2D p1, Point2D p2, Point2D p3, String name){
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.name = name;
  }

  public double area() {
    double temp = (p1.distance(p2)+p2.distance(p3)+p3.distance(p1))/2;
    return Math.sqrt(temp*(temp-p1.distance(p2))*(temp-p2.distance(p3))*(temp-p3.distance(p1)));
  }

  public double perimeter(){
    return p1.distance(p2)+p2.distance(p3)+p3.distance(p1);
  }

  /*public boolean isIsoceles(){
    if
  }*/

  public void translate(double dx, double dy) {
    p1.translate(dx,dy);
    p2.translate(dx,dy);
    p3.translate(dx,dy);
  }

  public String toString() {
      return name + " : (" + p1 + ", " + p2 + ", " + p3 + ")";
  }

  /*public boolean pointIsInside(Point2D p){
    if (center.distance(p) < radius){
      return true;
    }else{
      return false;
    }
  }*/

}
