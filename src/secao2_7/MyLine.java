package secao2_7;

public class MyLine {
  // Ex: The MyLine Class
  private MyPoint begin;
  private MyPoint end;

  // Constructor
  public MyLine(int x1, int y1, int x2, int y2) {
    this.begin = new MyPoint(x1, y1);
    this.end = new MyPoint(x2, y2);
  }

  public MyLine(MyPoint begin, MyPoint end) {
    this.begin = begin;
    this.end = end;
  }

  // Getter and Setter
  public MyPoint getBegin() {
    return begin;
  }

  public MyPoint getEnd() {
    return end;
  }

  public void setBegin(MyPoint begin) {
    this.begin = begin;
  }

  public void setEnd(MyPoint end) {
    this.end = end;
  }

  public int getBeginX() {
    return begin.getX();
  }

  public int getBeginY() {
    return begin.getY();
  }

  public int getEndX() {
    return end.getX();
  }

  public int getEndY() {
    return end.getY();
  }

  public void setBeginX(int x) {
    begin.setX(x);
  }

  public void setBeginY(int y) {
    begin.setY(y);
  }

  public void setBeginXY(int x, int y) {
    begin.setXY(x, y);
  }

  public void setEndX(int x) {
    end.setX(x);
  }

  public void setEndY(int y) {
    end.setY(y);
  }

  public void setEndXY(int x, int y) {
    end.setXY(x, y);
  }

  public double getLength() {
    return begin.distance(end);
  }

  public double getGradient() {
    return (double) (end.getY() - begin.getY()) / (end.getX() - begin.getX());
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return String.format("MyLine[begin=%s,end=%s]", begin, end);
  }

}
