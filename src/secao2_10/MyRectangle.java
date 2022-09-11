package secao2_10;

public class MyRectangle {
  // Ex: The MyRectangle Class
  private MyPoint topLeft;
  private MyPoint bottomRight;

  // Constructor
  public MyRectangle(int x1, int y1, int x2, int y2) {
    this.topLeft = new MyPoint(x1, y1);
    this.bottomRight = new MyPoint(x2, y2);
  }

  public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
    this.topLeft = topLeft;
    this.bottomRight = bottomRight;
  }

  // Getter
  public int getArea() {
    return (topLeft.getX() - bottomRight.getX()) * (topLeft.getY() - bottomRight.getY());
  }

  public int getPerimeter() {
    return (2 * (bottomRight.getX() - topLeft.getX())) + (2 * (bottomRight.getY() - topLeft.getY()));
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return String.format("MyRectangle[topLeft=%s,bottomRight=%s]", topLeft, bottomRight);
  }
}
