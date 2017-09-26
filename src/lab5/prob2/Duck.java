package lab5.prob2;

public abstract class Duck {

  protected FlyBehavior flyBehavior = new FlyWithWings();
  protected QuackBehavior quackBehavior = new Quack();

  public void fly() {
    flyBehavior.fly();
  }

  public void quack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("  swimming");
  }

  public void display() {
    System.out.println("  displaying");
  }
}
