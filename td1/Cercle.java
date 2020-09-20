class Cercle {

  private Point centre;
  private double rayon;

  Cercle(Point centre, double rayon){
    this.centre = centre;
    this.rayon = rayon;
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
    return "<circle cx='" + centre.getx() +"' cy='" + centre.gety() + "' r='" + rayon + "' />";
  }

}
