
class TestPoint {

	public static void main(String[] args) {
		Point p = new Point(32,12);
    Point p2 = new Point(30,10);

		p.afficher();
    p2.afficher();

    p.deplacement(4);

    System.out.println(p.distance(p2));

    p.afficher();
	}
}
