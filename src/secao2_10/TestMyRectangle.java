package secao2_10;

public class TestMyRectangle {
  public static void main(String[] args) {
    // Test program to test all constructors and public methods
    // of the class MyRectangle
    MyRectangle r1 = new MyRectangle(0, 1, 5, 5);
    System.out.println(r1);
    System.out.println("Area is " + r1.getArea());
    System.out.println("Perimeter is " + r1.getPerimeter());
    MyRectangle r2 = new MyRectangle(new MyPoint(1, 1), new MyPoint(5, 5));
    System.out.println(r2);
    System.out.println("Area is " + r2.getArea());
    System.out.println("Perimeter is " + r2.getPerimeter());
  }
}
