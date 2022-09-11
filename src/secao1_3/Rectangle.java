package secao1_3;

public class Rectangle {
  // Ex: The Rectangle Class
  // private instance variables
  private float length;
  private float width;

  // constructors
  public Rectangle() {
    length = 1.0f;
    width = 1.0f;
  }

  public Rectangle(float length, float width) {
    this.length = length;
    this.width = width;
  }

  // public methods
  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }

  public double getPerimeter() {
    return 2 * (length + width);
  }

  @Override
  public String toString() {
    return "Rectangle[length=" + length + ",width=" + width + "]";
  }
}
