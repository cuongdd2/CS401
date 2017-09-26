package lab7.prob5;

public class RubberDuck extends Duck {

  @Override
  public void fly() {
    unfly();
  }

  @Override
  public void quack() {
    squeak();
  }
}
