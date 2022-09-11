package secao2_1;

public class Author {
  // Author
  private String name;
  private String email;
  private char gender;

  // Constructor
  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
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

  public char getGender() {
    return gender;
  }

  // Return a self-descriptive string
  @Override
  public String toString() {
    return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
  }
}
