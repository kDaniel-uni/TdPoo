import java.io.FileWriter;
import java.io.IOException;

class TestCercle {

	public static void main(String[] args) throws IOException {

		Point c1 = new Point(132,112);
    Point c2 = new Point(300,400);
    Point c3 = new Point(900,450);

    Cercle cercle1 = new Cercle(c1,80,12,250,56);
    Cercle cercle2 = new Cercle(c2,130,50,180,180);
    Cercle cercle3 = new Cercle(c3,300,0,15,80);

    System.out.println("cercle1 : " + cercle1.surface() + " cercle2 : " + cercle2.surface() + " cercle3 : " + cercle3.surface());

    System.out.println(" c1 est il dans cercle2 ? " + cercle2.estInterieur(c1));
    System.out.println(" c3 est il dans cercle1 ? " + cercle1.estInterieur(c3));

		FileWriter out = new FileWriter("testCercle.svg");
		out.write("<?xml version='1.0' encoding='utf-8'?>\n");
		out.write("<svg xmlns='http://www.w3.org/2000/svg' version='1.1' width='1000' height='1000'>");
		out.write(cercle1.svg());
		out.write(cercle2.svg());
		out.write(cercle3.svg());
		out.write("</svg>");
		out.close();
	}
}
