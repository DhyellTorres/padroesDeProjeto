package secao2_9;

public class MyPoint {
  // Ex: The MyPoint Class
  private int x;
  private int y;

  // Constructor
  public MyPoint() {
    this.x = 0;
    this.y = 0;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Getter
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int[] getXY() {
    int[] xy = { x, y };
    return xy;
  }

  // Setter
  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return String.format("(%d, %d)", x, y);
  }

  public double distance(int x, int y) {
    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
  }

  public double distance(MyPoint another) {
    return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
  }

  public double distance() {
    return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
  }
}