package lab2.prob3;

public class Base {

  public static int b = -10;

  static {
    System.out.println("Base " + b);
  }

  public Base() {
    System.out.println("base " + this.method());
  }

  int method() {
    return 0;
  }
}
