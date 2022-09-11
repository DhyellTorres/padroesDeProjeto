package secao2_4;

public class Customer {
  // Customer
  private int id;
  private String name;
  private int discount;

  // Constructor
  public Customer(int id, String name, int discount) {
    this.id = id;
    this.name = name;
    this.discount = discount;
  }

  // Getter and Setter for private instance variables
  public int getID() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return name + "(" + id + ")" + "(" + discount + "%)";
  }
}
