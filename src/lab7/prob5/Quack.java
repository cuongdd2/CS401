package lab7.prob5;

public interface Quack {

  default void quack() {
    System.out.println("  quacking");
  }
}
