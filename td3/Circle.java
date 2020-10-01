public class Circle extends Shape2D {

  private Point2D center;
  private double radius;

  public Circle(Point2D center, double radius) {
    this.center = center;
    this.radius = radius;
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

  public void print() {
    System.out.println("Circle") ;
  }

  public boolean pointIsInside(Point2D p){
    if (center.distance(p) < radius){
      return true;
    }else{
      return false;
    }
  }
}
