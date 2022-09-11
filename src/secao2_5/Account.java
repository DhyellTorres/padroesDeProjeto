package secao2_5;

public class Account {
  // Account
  private int id;
  private Customer customer;
  private double balance = 0.0;

  // Constructor
  public Account(int id, Customer customer, double balance) {
    this.id = id;
    this.customer = customer;
    this.balance = balance;
  }

  public Account(int id, Customer customer) {
    this.id = id;
    this.customer = customer;
  }

  // Getter
  public int getID() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public double getBalance() {
    return balance;
  }

  // Setter
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    String name = customer.getName();
    return String.format("%s(id=%d) balance=$%.2f", name, id, balance);
  }
}
