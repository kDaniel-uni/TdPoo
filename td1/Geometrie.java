import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Geometrie {

  public static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) throws IOException{

    System.out.println("Contstruction d'un triangle");

    Point[] tab = new Point[3];

    for(int a=0; a<3; a++){

      System.out.println("Contstruction d'un point");
      System.out.println("Veuillez entrer x : ");
      double xtemp = clavier.nextDouble();
      System.out.println("Veuillez entrer y : ");
      double ytemp = clavier.nextDouble();

      tab[a] = new Point(xtemp,ytemp);

    }

    Triangle tri = new Triangle(tab[0],tab[1],tab[2],40,250,6);

    System.out.println("Permietre du triangle : " + tri.perimetre());
    System.out.println("Isocele : " + tri.estIsocele());

    FileWriter out = new FileWriter("testTriangle.svg");
		out.write("<?xml version='1.0' encoding='utf-8'?>\n");
		out.write("<svg xmlns='http://www.w3.org/2000/svg' version='1.1' width='1000' height='1000'>");
		out.write(tri.svg());
		out.write("</svg>");
		out.close();

	}
}
