package secao2_3;

public class Author {
  // Author
  private String name;
  private String email;

  // Constructor
  public Author(String name, String email) {
    this.name = name;
    this.email = email;
  }

  // Getter and Setter for private instance variables
  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return "Author[name=" + name + ",email=" + email + "]";
  }
}
