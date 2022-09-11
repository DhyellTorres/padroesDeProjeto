package secao1_4;

public class Employee {
  // Ex: The Employee Class
  // private instance variables
  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  // constructors
  public Employee(int id, String firstName, String lastName, int salary) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  // getters
  public int getID() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public int getSalary() {
    return salary;
  }

  // setters
  public void setSalary(int salary) {
    this.salary = salary;
  }

  // methods
  public int getAnnualSalary() {
    return salary * 12;
  }

  public int raiseSalary(int percent) {
    return salary += salary * percent / 100;
  }

  @Override
  public String toString() {
    return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
  }
}
