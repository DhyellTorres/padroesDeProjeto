package secao2_4;

public class Invoice {
  // Invoice
  private int id;
  private Customer customer;
  private double amount;

  // Constructor
  public Invoice(int id, Customer customer, double amount) {
    this.id = id;
    this.customer = customer;
    this.amount = amount;
  }

  // Getter and Setter for private instance variables
  public int getID() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public int getCustomerID() {
    return customer.getID();
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public int getCustomerDiscount() {
    return customer.getDiscount();
  }

  public double getAmountAfterDiscount() {
    return amount - (amount * customer.getDiscount() / 100);
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return "Invoice[id=" + id + ",customer=" + customer + ",amount=" + amount + "]";
  }
}
