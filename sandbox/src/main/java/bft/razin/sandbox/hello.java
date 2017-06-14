package bft.razin.sandbox;

public class Hello {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Женя");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со сторонами " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }
}