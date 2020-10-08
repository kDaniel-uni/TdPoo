package shape;
public abstract class Shape2D {

  String protected name;

    public double area() {
      return 0;
    }

    public double perimeter() {
        return 0;
    }

    public abstract void translate(double dx, double dy) { }

    public void translate(double delta) {
        translate(delta, delta);
    }

    public void print() {
        System.out.println("Shape2D");
    }
}
