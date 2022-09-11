package secao2_5;

public class TestMain {
  public static void main(String[] args) {
    Customer customer = new Customer(1001, "Jane Smith", 10);
    Account account = new Account(1001, customer, 1000.0);
    System.out.println(account);
    account.setBalance(2000.0);
    System.out.println(account.getBalance());
    System.out.println(account.getCustomer().getName());
    System.out.println(account.getCustomer().getGender());
    System.out.println(account.getCustomer().getID());
    System.out.println(account.getID());
  }
}
