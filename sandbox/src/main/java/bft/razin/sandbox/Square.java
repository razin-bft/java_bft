package bft.razin.sandbox;

/**
 * Created by e.razinkov on 14.06.2017.
 */
public class Square {
  public double l;

  public Square(double l){
    this.l = l;
  }

  public double area(){
    return this.l * this.l;
  }
}
