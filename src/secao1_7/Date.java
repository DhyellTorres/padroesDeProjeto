package secao1_7;

public class Date {
  // Ex: The Date Class
  // private instance variables
  private int day;
  private int month;
  private int year;

  // constructors
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // public methods
  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public String toString() {
    if (month < 10 && day < 10) {
      return "0" + day + "/0" + month + "/" + year;
    } else if (day < 10) {
      return "0" + day + "/" + month + "/" + year;
    } else if (month < 10) {
      return day + "/0" + month + "/" + year;
    } else {
      return day + "/" + month + "/" + year;
    }
  }

}
