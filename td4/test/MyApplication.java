package test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import shape.circle.Circle;
import shape.point.Point2D;
import shape.polygon.AxesAlignedRectangle;
import shape.polygon.AxesAlignedSquare;
import shape.polygon.Triangle;

public class MyApplication extends Application {

    public void start(Stage stage) throws Exception {
        Point2D p1 = new Point2D(590, 60, "p1");
        Point2D p2 = new Point2D(120,700, "p2");
        Point2D p3 = new Point2D(400,190, "p3");
        Circle c1 = new Circle(p1, 180, "c1");
        Triangle t1 = new Triangle(p1,p2,p3,"t1",Color.BLUE);
        AxesAlignedRectangle r1 = new AxesAlignedRectangle(p3,50,80,"r1",Color.ANTIQUEWHITE);
        AxesAlignedSquare s1 = new AxesAlignedSquare(p2,140,"s1");

        Group root = new Group();
        root.getChildren().add(c1.toShapeFX());
        root.getChildren().add(t1.toShapeFX());
        root.getChildren().add(r1.toShapeFX());
        root.getChildren().add(s1.toShapeFX());

        Scene scene = new Scene(root, 1200, 900);

        stage.setTitle("Test JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String... args) {
        Application.launch(args);
    }
}
