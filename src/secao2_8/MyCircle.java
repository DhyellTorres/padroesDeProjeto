package secao2_8;

public class MyCircle {
  // Ex: The MyCircle Class
  private MyPoint center;
  private int radius;

  // Constructor
  public MyCircle() {
    this.center = new MyPoint();
    this.radius = 1;
  }

  public MyCircle(int x, int y, int radius) {
    this.center = new MyPoint(x, y);
    this.radius = radius;
  }

  public MyCircle(MyPoint center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  // Getter
  public MyPoint getCenter() {
    return center;
  }

  public int getRadius() {
    return radius;
  }

  public int getCenterX() {
    return center.getX();
  }

  public int getCenterY() {
    return center.getY();
  }

  public int[] getCenterXY() {
    return center.getXY();
  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }

  // Setter
  public void setCenter(MyPoint center) {
    this.center = center;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public void setCenterX(int x) {
    this.center.setX(x);
  }

  public void setCenterY(int y) {
    this.center.setY(y);
  }

  public void setCenterXY(int x, int y) {
    this.center.setXY(x, y);
  }

  public double distance(MyCircle another) {
    return center.distance(another.center);
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return String.format("MyCircle[radius=%d,center=%s]", radius, center);
  }
}
