package secao2_7;

public class TestMyLine {
  public static void main(String[] args) {
    // Test program to test all constructors and public methods
    MyLine line1 = new MyLine(0, 0, 3, 4);
    System.out.println(line1);
    System.out.println("Length is: " + line1.getLength());
    System.out.println("Gradient is: " + line1.getGradient());
    System.out.println("Begin is: " + line1.getBegin());
    System.out.println("End is: " + line1.getEnd());
    line1.setBegin(new MyPoint(1, 2));
    line1.setEnd(new MyPoint(3, 4));
    System.out.println(line1);
    System.out.println("Begin is: " + line1.getBegin());
    System.out.println("End is: " + line1.getEnd());
  }
}
