package prob1;

import java.util.Objects;

public class Book extends LendingItem {

  private String isbn;
  private String title;
  private String authorFirstName;
  private String authorLastName;

  public Book(String isbn, String title, String fname, String lname) {
    this.isbn = isbn;
    this.title = title;
    this.authorFirstName = fname;
    this.authorLastName = lname;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof Book)) {
      return false;
    }
    Book b = (Book) obj;
    return Objects.equals(this.isbn, b.isbn) && Objects.equals(title, b.title)
        && Objects.equals(authorFirstName, b.authorFirstName) && Objects
        .equals(authorLastName, b.authorLastName);
  }
}
