package lab5.prob2;

public class RedheadDuck extends Duck {

  public RedheadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
}
