package secao2_9;

public class TestMyTriangle {
  public static void main(String[] args) {
    // Test program to test all constructors and public methods
    MyTriangle triangle1 = new MyTriangle(0, 0, 1, 1, 2, 5);
    System.out.println(triangle1);
    System.out.println("Perimeter is: " + triangle1.getPerimeter());
    System.out.println("Type is: " + triangle1.getType());
    MyTriangle triangle2 = new MyTriangle(new MyPoint(3, 0), new MyPoint(0, 4), new MyPoint(3, 0));
    System.out.println(triangle2);
    System.out.println("Perimeter is: " + triangle2.getPerimeter());
    System.out.println("Type is: " + triangle2.getType());
    MyTriangle triangle3 = new MyTriangle(new MyPoint(1, 1), new MyPoint(1, 1), new MyPoint(1, 1));
    System.out.println(triangle3);
    System.out.println("Perimeter is: " + triangle3.getPerimeter());
    System.out.println("Type is: " + triangle3.getType());
  }
}
