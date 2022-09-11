package secao2_8;

public class TestMyCircle {
  public static void main(String[] args) {
    // Test program to test all constructors and public methods
    MyCircle circle1 = new MyCircle(0, 0, 3);
    System.out.println(circle1);
    System.out.println("Radius is: " + circle1.getRadius());
    System.out.println("Area is: " + circle1.getArea());
    System.out.println("Circumference is: " + circle1.getCircumference());
    System.out.println("Center is: " + circle1.getCenter());
    System.out.println("CenterX is: " + circle1.getCenterX());
    System.out.println("CenterY is: " + circle1.getCenterY());
    System.out.println("CenterXY is: " + circle1.getCenterXY()[0] + ", " + circle1.getCenterXY()[1]);
    circle1.setCenter(new MyPoint(1, 2));
    circle1.setRadius(3);
    System.out.println(circle1);
    System.out.println("Center is: " + circle1.getCenter());
    System.out.println("Radius is: " + circle1.getRadius());
  }
}
