package lab7.prob5;

public interface Flyable {

  default void fly() {
    System.out.println("  fly with wings");
  }
}
