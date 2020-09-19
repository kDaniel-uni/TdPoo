
class TestCercle {

	public static void main(String[] args) {

		Point c1 = new Point(32,12);
    Point c2 = new Point(30,10);
    Point c3 = new Point(19,4);

    Cercle cercle1 = new Cercle(c1,8);
    Cercle cercle2 = new Cercle(c2,18);
    Cercle cercle3 = new Cercle(c3,3);

    System.out.println("cercle1 : " + cercle1.surface() + " cercle2 : " + cercle2.surface() + " cercle3 : " + cercle3.surface());

    System.out.println(" c1 est il dans cercle2 ? " + cercle2.estInterieur(c1));
    System.out.println(" c3 est il dans cercle1 ? " + cercle1.estInterieur(c3));
	}
}
