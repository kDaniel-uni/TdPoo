class Cercle {

  private Point centre;
  private double rayon;
  private int r,g,b;

  Cercle(Point centre, double rayon , int r, int g, int b){
    this.centre = centre;
    this.rayon = rayon;
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

  double surface(){
    return 2*Math.PI*rayon*rayon;
  }

  boolean estInterieur(Point p){
    if (centre.distance(p) < rayon){
      return true;
    }else{
      return false;
    }
  }

  String svg(){
    return "<circle cx='" + centre.getx() +"' cy='" + centre.gety() + "' r='" + rayon + "' fill='rgb(" + r + ", " + g + ", " + b + ")'/>";
  }

}
