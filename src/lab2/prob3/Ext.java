package lab2.prob3;

public class Ext extends Base {

  public static int e = 10;
  public int i = 10;

  static {
    System.out.println("Ext " + e);
    System.out.println(Base.b);
  }

  public Ext() {
    System.out.println("ext " + method());
  }

  public int method() {
    return 3;
  }
}
