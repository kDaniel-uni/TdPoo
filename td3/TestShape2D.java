public class TestShape2D {
    public static void main(String[] args) {
        Point2D  p1 = new Point2D(1, 2);
        System.out.println(p1);
        p1.translate(5);
        System.out.println(p1);

        Point2D p2 = new Point2D(12,7);
        Point2D p3 = new Point2D(4,19);
        Circle c1 = new Circle(p1, 8);
        System.out.println(c1);

        Triangle t1 = new Triangle(p1,p2,p3);
        System.out.println(t1);

        AxesAlignedRectangle r1 = new AxesAlignedRectangle(p1,5,8);
        System.out.println(r1);

        AxesAlignedSquare s1 = new AxesAlignedSquare(p1,9);
        System.out.println(s1);
    }
}
