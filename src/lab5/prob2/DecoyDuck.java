package lab5.prob2;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehavior = new CannotFly();
    quackBehavior = new MuteQuack();
  }
}
