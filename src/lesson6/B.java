package lesson6;

public class B extends A {

  int i;

  public void say() {
    super.i = 3;
    System.out.println(i);
    System.out.println(super.i);
  }

  public static void main(String[] args) {
    B b = new B();
    b.i = 1;
    b.say();

  }
}
