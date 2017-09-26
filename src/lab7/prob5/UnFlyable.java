package lab7.prob5;

public interface UnFlyable {

  default void unfly() {
    System.out.println("  cannot fly");
  }
}
