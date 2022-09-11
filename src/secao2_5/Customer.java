package secao2_5;

public class Customer {
  // Customer
  private int ID;
  private String name;
  private char gender;

  // Constructor
  public Customer(int ID, String name, int discount) {
    this.ID = ID;
    this.name = name;
    if (discount == 0) {
      gender = 'm';
    } else {
      gender = 'f';
    }
  }

  // Getter
  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public char getGender() {
    return gender;
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return name + "(" + ID + ")";
  }
}
