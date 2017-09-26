package lab7.prob5;

public class DecoyDuck extends Duck {

  @Override
  public void fly() {
    unfly();
  }

  @Override
  public void quack() {
    mute();
  }
}
