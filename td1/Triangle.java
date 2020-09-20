class Triangle {

  private Point p1;
  private Point p2;
  private Point p3;

  Triangle(Point p1, Point p2, Point p3){
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;

  }

  double perimetre(){
    return p1.distance(p2)+p2.distance(p3)+p3.distance(p1);
  }

  boolean estIsocele(){
    if ((p1.distance(p2) == p2.distance(p3)) || (p2.distance(p3) == p3.distance(p1)) || (p3.distance(p1) == p1.distance(p2))){
      return true;
    } else {
      return false;
    }
  }

  String svg(){
    return ("<polygon points='" + p1.getx() + " " + p1.gety() + ", " + p2.getx() + " " + p2.gety() + ", " + p3.getx() + " " + p3.gety() + "'/>");
  }

}
