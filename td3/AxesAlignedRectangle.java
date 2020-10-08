public class AxesAlignedRectangle extends Shape2D{

  private Point2D upperLeft;
  private Point2D upperRight;
  private Point2D lowerRight;
  private Point2D lowerLeft;

  public AxesAlignedRectangle(Point2D ul, double distX, double distY){
    upperLeft = ul;
    upperRight = new Point2D(upperLeft.getX() + distX,upperLeft.getY());
    lowerRight = new Point2D(upperLeft.getX() + distX,upperLeft.getY() - distY);
    lowerLeft = new Point2D(upperLeft.getX(),upperLeft.getY() - distY);
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

  public void print() {
    System.out.println("AxesAlignedRectangle");
  }
}
