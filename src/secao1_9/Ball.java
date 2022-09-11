package secao1_9;

public class Ball {
  // Ex: The Ball Class
  // private instance variables
  private float x;
  private float y;
  private int radius;
  private float xDelta;
  private float yDelta;

  // constructors
  public Ball(float x, float y, int radius, float xDelta, float yDelta) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.xDelta = xDelta;
    this.yDelta = yDelta;
  }

  public Ball(float x, float y, int radius, int speed, int directionInDegree) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.xDelta = (float) (speed * Math.cos(Math.toRadians(directionInDegree)));
    this.yDelta = (float) (-speed * Math.sin(Math.toRadians(directionInDegree)));
  }

  // getters and setters
  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public float getXDelta() {
    return xDelta;
  }

  public void setXDelta(float xDelta) {
    this.xDelta = xDelta;
  }

  public float getYDelta() {
    return yDelta;
  }

  public void setYDelta(float yDelta) {
    this.yDelta = yDelta;
  }

  // instance methods
  @Override
  public String toString() {
    return String.format("Ball[(%2.1f,%2.1f),speed=(%1.1f,%1.1f)]", x, y, xDelta, yDelta);
  }

  public void move() {
    x += xDelta;
    y += yDelta;
  }

  public void reflectHorizontal() {
    xDelta = -xDelta;
  }

  public void reflectVertical() {
    yDelta = -yDelta;
  }

}
