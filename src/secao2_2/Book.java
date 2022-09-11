package secao2_2;

public class Book {
  // Book
  private String name;
  private Author author[];
  private double price;
  private int qty = 0;

  // Constructor
  public Book(String name, Author author[], double price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public Book(String name, Author author[], double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  // Getter and Setter for private instance variables
  public String getName() {
    return name;
  }

  public Author[] getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String getAuthorName() {
    String authorName = "";
    for (int i = 0; i < author.length; i++) {
      authorName += author[i].getName();
      if (i < author.length - 1) {
        authorName += ", ";
      }
    }
    return authorName;
  }

  public String getAuthorEmail() {
    String authorEmail = "";
    for (int i = 0; i < author.length; i++) {
      authorEmail += author[i].getEmail();
      if (i < author.length - 1) {
        authorEmail += ", ";
      }
    }
    return authorEmail;
  }

  public String getAuthorGender() {
    String authorGender = "";
    for (int i = 0; i < author.length; i++) {
      authorGender += author[i].getGender();
      if (i < author.length - 1) {
        authorGender += ", ";
      }
    }
    return authorGender;
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return "Book[name=" + name + ",author={" + getAuthorName() + "},price=" + price + ",qty=" + qty + "]";
  }
}
