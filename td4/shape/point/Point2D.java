package shape.point;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import shape.Shape2D;

public class Point2D extends Shape2D {
    double x, y;

    public Point2D(double x, double y, String name, Color col) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Point2D(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.col = Color.BLACK;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void translate(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    public String toString() {
        return name + " : (" + x + ", "  + y + ")";
    }

    public boolean equals(Object o){
        if (o == null){return false;}
        if (o instanceof Point2D) {
            Point2D p = (Point2D)o;
            return (this.x == p.x) && (this.y == p.y);
        }  else {
            return false;
        }
    }

    public double distance(Point2D p){
        double d1 = p.x - x;
        double d2 = p.y - y;
        return Math.sqrt(d1*d1 + d2*d2);
   }

    public Shape toShapeFX(){
        return new javafx.scene.shape.Circle(x,y,1, col);
    }

}
