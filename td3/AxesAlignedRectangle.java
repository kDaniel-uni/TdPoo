public class AxesAlignedRectangle {

  private Point2D upperLeft;
  private Point2D upperRight;
  private Point2D lowerRight;
  private Point2D lowerLeft;

  public AxesAlignedRectangle(Point2D ul, Point2D lr){
    this.upperLeft = ul;
    this.lowerRight = lr;
    upperRight = new Point2D(upperLeft.getY,lowerRight.getX);
    lowerLeft = new Point2D(lowerRight.getY,upperLeft.getX);
  }

  public double area() {
    return 
  }
}
