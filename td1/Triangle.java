class Triangle {

  private Point p1;
  private Point p2;
  private Point p3;
  private int r,g,b;

  Triangle(Point p1, Point p2, Point p3, int r, int g, int b){
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.r = r;
    this.g = g;
    this.b = b;

  }

  int getr(){
    return r;
  }

  int getg(){
    return g;
  }

  int getb(){
    return b;
  }

  void setr(int r){
    this.r = r;
  }

  void setg(int g){
    this.g = g;
  }

  void setb(int b){
    this.b = b;
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
    return ("<polygon points='" + p1.getx() + " " + p1.gety() + ", " + p2.getx() + " " + p2.gety() + ", " + p3.getx() + " " + p3.gety() + "' fill='rgb(" + r + ", "
     + g + ", " + b + ")'/>");
  }

}
