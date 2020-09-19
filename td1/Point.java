class Point {

  private double x;
  private double y;

  Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  void afficher(){
    System.out.println("x : " + x + " , y : " + y);
  }

  void deplacement(double dx, double dy){
    x += dx;
    y += dy;
  }

  void deplacement(double delta){
    x += delta;
    y += delta;
  }

  double distance(Point p){
    return Math.sqrt((( this.x - p.x )*( this.x - p.x )) + ((this.y - p.y)*(this.y - p.y)));
  }
}
