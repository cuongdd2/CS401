package lab7.prob5;

public interface Squeak {

  default void squeak() {
    System.out.println("  squeaking");
  }
}
