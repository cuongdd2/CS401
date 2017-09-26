package lab9.prob9;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Book book = new Book("test", 3);
    List<BookCopy> copies = book.getCopies();
    copies.forEach(BookCopy::changeAvailability);

    System.out.println(book.isAvailable());
  }
}
