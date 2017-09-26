package lesson7;

public class Static {

  private P p = new P();

  static {
    System.out.println("static block");
  }

  {
    p.f = 5;
    System.out.println("block");
  }

  public Static() {
    System.out.println("Static");
  }


  static class P {

    int f;

    static {
      System.out.println("P static");
    }

    {
      System.out.println("P block");
    }
  }

  public static void main(String[] args) {
    new Static();
  }
}
