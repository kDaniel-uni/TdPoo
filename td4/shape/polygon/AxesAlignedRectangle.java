package shape;
public class AxesAlignedRectangle extends Shape2D{

  private Point2D upperLeft;
  private Point2D upperRight;
  private Point2D lowerRight;
  private Point2D lowerLeft;

  public AxesAlignedRectangle(Point2D ul, double distX, double distY, String name){
    upperLeft = ul;
    upperRight = new Point2D(upperLeft.getX() + distX, upperLeft.getY(), "upperRight");
    lowerRight = new Point2D(upperLeft.getX() + distX, upperLeft.getY() - distY, "lowerRight");
    lowerLeft = new Point2D(upperLeft.getX(),upperLeft.getY() - distY, "lowerLeft");
    this.name = name;
  }

  public double area() {
    return upperLeft.distance(upperRight) * upperRight.distance(lowerRight);
  }

  public double perimeter() {
    return upperLeft.distance(upperRight) + upperRight.distance(lowerRight) + lowerRight.distance(lowerLeft) + lowerLeft.distance(upperLeft);
  }

  public void translate(double dx, double dy) {
    upperLeft.translate(dx,dy);
    upperRight.translate(dx,dy);
    lowerRight.translate(dx,dy);
    lowerLeft.translate(dx,dy);
  }

  public String toString() {
    return name + " : (" + upperLeft + ", " + upperRight + ", " + lowerRight + ", " + lowerLeft + ")";
  }
}
