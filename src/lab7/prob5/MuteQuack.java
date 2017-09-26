package lab7.prob5;

public interface MuteQuack {

  default void mute() {
    System.out.println("  cannot quack");
  }
}
