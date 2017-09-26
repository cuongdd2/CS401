package lab7.prob5;

public class Duck implements FlyBehavior, QuackBehavior, UnFlyable, Squeak, MuteQuack {

  public void swim() {
    System.out.println("  swimming");
  }

  public void display() {
    System.out.println("  displaying");
  }
}
