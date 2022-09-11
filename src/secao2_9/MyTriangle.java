package secao2_9;

public class MyTriangle {
  // Ex: The MyTriangle Class
  private MyPoint v1;
  private MyPoint v2;
  private MyPoint v3;

  // Constructor
  public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    this.v1 = new MyPoint(x1, y1);
    this.v2 = new MyPoint(x2, y2);
    this.v3 = new MyPoint(x3, y3);
  }

  public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }

  // Getter
  public double getPerimeter() {
    return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
  }

  public String getType() {
    double side1 = v1.distance(v2);
    double side2 = v2.distance(v3);
    double side3 = v3.distance(v1);
    if (side1 == side2 && side2 == side3) {
      return "Equilateral";
    } else if (side1 == side2 || side2 == side3 || side3 == side1) {
      return "Isosceles";
    } else {
      return "Scalene";
    }
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]", v1, v2, v3);
  }
}
